package com.ironsource.mediationsdk.logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class IronSourceLogger {

    /* renamed from: a, reason: collision with root package name */
    int f37575a;

    /* renamed from: b, reason: collision with root package name */
    private String f37576b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public IronSourceLogger(String str) {
        this.f37576b = str;
        this.f37575a = 0;
    }

    public int a() {
        return this.f37575a;
    }

    public String b() {
        return this.f37576b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f37576b;
            if (str != null && str.equals(ironSourceLogger.f37576b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th2);

    public void setDebugLevel(int i10) {
        this.f37575a = i10;
    }

    public IronSourceLogger(String str, int i10) {
        this.f37576b = str;
        this.f37575a = i10;
    }
}
