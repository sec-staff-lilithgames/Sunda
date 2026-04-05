package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.explorestack.protobuf.Struct;
import io.bidmachine.protobuf.Extras;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class ExtraParamsManager {
    static final String KEY_MRAID_JS = "mraid_js";
    private static volatile ExtraParamsManager instance;
    private Struct privateExtras;
    private final AtomicBoolean isExtrasPrepared = new AtomicBoolean(false);
    private final AtomicBoolean needLoadFromStore = new AtomicBoolean(true);
    private final Object loadFromStoreLock = new Object();
    private final Object updateExtrasLock = new Object();
    private final qr.f publicDataRetriever = new qr.f();
    private final qr.f internalDataRetriever = new qr.f();

    private ExtraParamsManager() {
    }

    private void checkAndPrepareExtras(Context context, Extras extras) {
        synchronized (this.updateExtrasLock) {
            try {
                if (isExtrasPrepared()) {
                    return;
                }
                setExtras(context, extras);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ExtraParamsManager get() {
        ExtraParamsManager extraParamsManager;
        ExtraParamsManager extraParamsManager2 = instance;
        if (extraParamsManager2 != null) {
            return extraParamsManager2;
        }
        synchronized (ExtraParamsManager.class) {
            try {
                extraParamsManager = instance;
                if (extraParamsManager == null) {
                    extraParamsManager = new ExtraParamsManager();
                    instance = extraParamsManager;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return extraParamsManager;
    }

    public qr.f getInternalDataRetriever(Context context) {
        loadFromStore(context);
        return this.internalDataRetriever;
    }

    public Struct getPrivateStruct(Context context) {
        loadFromStore(context);
        return this.privateExtras;
    }

    public Object getPublic(Context context, String str) {
        loadFromStore(context);
        return this.publicDataRetriever.getObjectOrNull(str);
    }

    public boolean isExtrasPrepared() {
        return this.isExtrasPrepared.get();
    }

    public void loadFromStore(Context context) {
        if (isExtrasPrepared()) {
            return;
        }
        synchronized (this.loadFromStoreLock) {
            try {
                if (this.needLoadFromStore.compareAndSet(true, false)) {
                    SharedPreferences sharedPreferencesE = jh.i.E(context);
                    Extras from = null;
                    try {
                        from = Extras.parseFrom(Base64.decode(pr.m.optString(sharedPreferencesE, "init_extras", null), 0));
                    } catch (Exception unused) {
                        pr.m.remove(sharedPreferencesE, "init_extras");
                    }
                    checkAndPrepareExtras(context, from);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setExtras(Context context, Extras extras) {
        this.isExtrasPrepared.set(true);
        this.needLoadFromStore.set(false);
        synchronized (this.updateExtrasLock) {
            try {
                if (extras == null) {
                    this.publicDataRetriever.clear();
                    this.internalDataRetriever.clear();
                    this.privateExtras = null;
                    pr.m.remove(jh.i.E(context), "init_extras");
                    return;
                }
                this.publicDataRetriever.setStruct(extras.getPublic());
                this.internalDataRetriever.setStruct(extras.getInternal());
                this.privateExtras = extras.getPrivate();
                try {
                    pr.m.putString(jh.i.E(context), "init_extras", Base64.encodeToString(extras.toByteArray(), 0));
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
