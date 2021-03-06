package biz.dealnote.messenger.settings;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import androidx.annotation.IntDef;
import androidx.appcompat.app.AppCompatDelegate;

/**
 * Created by admin on 08.10.2016.
 * phoenix
 */
@IntDef({NightMode.DISABLE, NightMode.ENABLE, NightMode.AUTO})
@Retention(RetentionPolicy.SOURCE)
public @interface NightMode {
    int DISABLE = AppCompatDelegate.MODE_NIGHT_NO;
    int ENABLE = AppCompatDelegate.MODE_NIGHT_YES;
    int AUTO = AppCompatDelegate.MODE_NIGHT_AUTO;
}
