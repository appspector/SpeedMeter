package fly.speedmeter.grub;

import android.app.Application;

import com.appspector.sdk.AppSpector;

public class SpeedMeterApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initAppSpector();
    }

    public void initAppSpector() {
        AppSpector.build(this)
                .addLogMonitor()
                .addScreenshotMonitor()
                .addHttpMonitor()
                .addPerformanceMonitor()
                .run(BuildConfig.APPSPECTOR_API_KEY);
    }
}
