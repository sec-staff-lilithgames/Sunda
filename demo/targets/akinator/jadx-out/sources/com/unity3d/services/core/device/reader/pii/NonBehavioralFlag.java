package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;

    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final NonBehavioralFlag fromString(String value) {
            Object objM7131constructorimpl;
            e0.checkNotNullParameter(value, "value");
            try {
                int i10 = z.f87419c;
                String upperCase = value.toUpperCase(Locale.ROOT);
                e0.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objM7131constructorimpl = z.m7131constructorimpl(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) objM7131constructorimpl;
        }

        private Companion() {
        }
    }
}
