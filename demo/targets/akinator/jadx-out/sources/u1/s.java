package u1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {
    /* renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7362getAreAnyPressedaHzCxE(int i10) {
        return i10 != 0;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m7363indexOfFirstPressedaHzCxE(int i10) {
        if (i10 == 0) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); (i12 & 1) == 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m7364indexOfLastPressedaHzCxE(int i10) {
        int i11 = -1;
        for (int i12 = (i10 & (-97)) | ((i10 & 96) >>> 5); i12 != 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7365isAltGraphPressed5xRPYO0(int i10) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7366isAltPressed5xRPYO0(int i10) {
        return (i10 & 2) != 0;
    }

    /* renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7367isBackPressedaHzCxE(int i10) {
        return (i10 & 8) != 0;
    }

    /* renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m7368isCapsLockOn5xRPYO0(int i10) {
        return (i10 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0;
    }

    /* renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7369isCtrlPressed5xRPYO0(int i10) {
        return (i10 & 4096) != 0;
    }

    /* renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7370isForwardPressedaHzCxE(int i10) {
        return (i10 & 16) != 0;
    }

    /* renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7371isFunctionPressed5xRPYO0(int i10) {
        return (i10 & 8) != 0;
    }

    /* renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7372isMetaPressed5xRPYO0(int i10) {
        return (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0;
    }

    /* renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m7373isNumLockOn5xRPYO0(int i10) {
        return (i10 & 2097152) != 0;
    }

    /* renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m7374isPressedbNIWhpI(int i10, int i11) {
        return i11 != 0 ? i11 != 1 ? (i11 == 2 || i11 == 3 || i11 == 4) ? (i10 & (1 << i11)) != 0 : (i10 & (1 << (i11 + 2))) != 0 : m7377isSecondaryPressedaHzCxE(i10) : m7375isPrimaryPressedaHzCxE(i10);
    }

    /* renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7375isPrimaryPressedaHzCxE(int i10) {
        return (i10 & 33) != 0;
    }

    /* renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m7376isScrollLockOn5xRPYO0(int i10) {
        return (i10 & 4194304) != 0;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7377isSecondaryPressedaHzCxE(int i10) {
        return (i10 & 66) != 0;
    }

    /* renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7378isShiftPressed5xRPYO0(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m7379isSymPressed5xRPYO0(int i10) {
        return (i10 & 4) != 0;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m7380isTertiaryPressedaHzCxE(int i10) {
        return (i10 & 4) != 0;
    }
}
