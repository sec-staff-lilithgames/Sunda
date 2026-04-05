package io.sfbx.appconsent.logger.tree;

import android.util.Log;
import io.sfbx.appconsent.logger.type.ACLogType;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ACTree implements ACTreeContract {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ACLogType.values().length];
            try {
                iArr[ACLogType.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ACLogType.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ACLogType.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ACLogType.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // io.sfbx.appconsent.logger.tree.ACTreeContract
    public void log(ACLogType priority, String tag, String message, Throwable th2) {
        e0.checkNotNullParameter(priority, "priority");
        e0.checkNotNullParameter(tag, "tag");
        e0.checkNotNullParameter(message, "message");
        int i10 = WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 2) {
            Log.i(tag, ACLogType.INFO.getTag() + ' ' + message, th2);
            return;
        }
        if (i10 == 3) {
            Log.w(tag, ACLogType.WARNING.getTag() + ' ' + message, th2);
            return;
        }
        if (i10 != 4) {
            return;
        }
        Log.e(tag, ACLogType.ERROR.getTag() + ' ' + message, th2);
    }
}
