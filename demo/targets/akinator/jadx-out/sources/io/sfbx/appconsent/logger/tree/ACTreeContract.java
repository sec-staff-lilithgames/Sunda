package io.sfbx.appconsent.logger.tree;

import io.sfbx.appconsent.logger.type.ACLogType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ACTreeContract {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(ACTreeContract aCTreeContract, ACLogType aCLogType, String str, String str2, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i10 & 8) != 0) {
                th2 = null;
            }
            aCTreeContract.log(aCLogType, str, str2, th2);
        }
    }

    void log(ACLogType aCLogType, String str, String str2, Throwable th2);
}
