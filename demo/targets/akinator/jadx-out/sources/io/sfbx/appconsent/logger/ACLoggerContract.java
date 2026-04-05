package io.sfbx.appconsent.logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ACLoggerContract {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void d$default(ACLoggerContract aCLoggerContract, String str, String str2, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
            }
            aCLoggerContract.getClass();
        }

        public static /* synthetic */ void e$default(ACLoggerContract aCLoggerContract, String str, String str2, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i10 & 4) != 0) {
                th2 = null;
            }
            aCLoggerContract.e(str, str2, th2);
        }

        public static /* synthetic */ void i$default(ACLoggerContract aCLoggerContract, String str, String str2, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
            }
            aCLoggerContract.getClass();
        }

        public static /* synthetic */ void w$default(ACLoggerContract aCLoggerContract, String str, String str2, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i10 & 4) != 0) {
                th2 = null;
            }
            aCLoggerContract.w(str, str2, th2);
        }
    }

    void d(String str, String str2, Throwable th2);

    void e(String str, String str2, Throwable th2);

    void e(String str, Throwable th2);

    void i(String str, String str2, Throwable th2);

    void w(String str, String str2, Throwable th2);
}
