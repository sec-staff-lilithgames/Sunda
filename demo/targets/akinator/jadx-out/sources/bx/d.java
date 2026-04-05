package bx;

import dx.f;
import dx.k;
import java.util.Map;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final MDCAdapter f11383a;

    static {
        try {
            f11383a = a();
        } catch (Exception e10) {
            k.report("MDC binding unsuccessful.", e10);
        } catch (NoClassDefFoundError e11) {
            f11383a = new f();
            String message = e11.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e11;
            }
            k.report("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            k.report("Defaulting to no-operation MDCAdapter implementation.");
            k.report("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    public static MDCAdapter a() {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError unused) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    public static void clear() {
        MDCAdapter mDCAdapter = f11383a;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.clear();
    }

    public static String get(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f11383a;
        if (mDCAdapter != null) {
            return mDCAdapter.get(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static Map<String, String> getCopyOfContextMap() {
        MDCAdapter mDCAdapter = f11383a;
        if (mDCAdapter != null) {
            return mDCAdapter.getCopyOfContextMap();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    public static MDCAdapter getMDCAdapter() {
        return f11383a;
    }

    public static void put(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f11383a;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.put(str, str2);
    }

    public static c putCloseable(String str, String str2) throws IllegalArgumentException {
        put(str, str2);
        return new c(str);
    }

    public static void remove(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f11383a;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.remove(str);
    }

    public static void setContextMap(Map<String, String> map) {
        MDCAdapter mDCAdapter = f11383a;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.setContextMap(map);
    }
}
