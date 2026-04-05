package com.ironsource.adqualitysdk.sdk.i;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ii {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static byte[] f2715 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f2716 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2717 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2718;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2719;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2720;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final String[] f2721;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2722;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final b f2723;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final SQLiteDatabase f2724;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends SQLiteOpenHelper {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2725 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static long f2726 = -1962244487376634150L;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2727 = 1;

        public b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static String m2818(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (j.f2852) {
                try {
                    j.f2850 = i10;
                    char[] cArr2 = new char[cArr.length];
                    j.f2851 = 0;
                    while (true) {
                        int i11 = j.f2851;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2726);
                            j.f2851++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
            int i10 = f2725 + 65;
            f2727 = i10 % 128;
            if (i10 % 2 == 0) {
                sQLiteDatabase.isReadOnly();
                throw null;
            }
            if (!sQLiteDatabase.isReadOnly()) {
                sQLiteDatabase.execSQL(m2818("纊罗紥笀秫矀痀玥灍湿氉樦棉曧撷抠捏慬彉崘寸", KeyEvent.getDeadChar(0, 0) + 479).intern());
                f2727 = (f2725 + 43) % 128;
            }
            sQLiteDatabase.execSQL(m2818("纙샷ɡ䗦蝲웤ࠀ䯷赣쳯\u0e60凪錎틠ᑮ型饤\ud8fa᩠嶗齳\udee9⁹揠ꕦ\ue4ee☜槔ꭈ\ueae6ⱋ濏녕\uf0f7㉡疯띭\uf6e4㡹箣뵖ﳈ㹔臛쌮˙䑚蟂쥇ࣔ䩆跎켶\u0eda偕鏊픾ᒽ噪駾\udb72᪹屌鿞\ue142₱才", 48767 - ExpandableListView.getPackedPositionType(0L)).intern());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            int i12 = f2727 + 31;
            f2725 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        m2812();
        f2721 = new String[]{m2811((-35) - TextUtils.getCapsMode("", 0, 0), (short) (TextUtils.getTrimmedLength("") + 24), (-159487865) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) (TextUtils.lastIndexOf("", '0') + 1), 172712483 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), m2811((ViewConfiguration.getTapTimeout() >> 16) - 35, (short) ((ViewConfiguration.getTapTimeout() >> 16) - 8), View.resolveSize(0, 0) - 159487882, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 172712495).intern()};
        int i10 = f2718 + 105;
        f2717 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public ii(Context context, String str) {
        b bVar = new b(context, str);
        this.f2723 = bVar;
        this.f2724 = bVar.getWritableDatabase();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2811(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (n.f3160) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2722;
                int i14 = i10 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2715;
                    i14 = bArr != null ? (byte) (bArr[f2720 + i11] + i13) : (short) (f2716[f2720 + i11] + i13);
                }
                if (i14 > 0) {
                    n.f3165 = ((i11 + i14) - 2) + f2720 + i15;
                    n.f3163 = b10;
                    char c10 = (char) (i12 + f2719);
                    n.f3162 = c10;
                    sb2.append(c10);
                    n.f3161 = n.f3162;
                    n.f3164 = 1;
                    while (n.f3164 < i14) {
                        byte[] bArr2 = f2715;
                        if (bArr2 != null) {
                            int i16 = n.f3165;
                            n.f3165 = i16 - 1;
                            n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                        } else {
                            short[] sArr = f2716;
                            int i17 = n.f3165;
                            n.f3165 = i17 - 1;
                            n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                        }
                        sb2.append(n.f3162);
                        n.f3161 = n.f3162;
                        n.f3164++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m2812() {
        f2720 = 159487882;
        f2722 = 34;
        f2719 = -172712377;
        f2715 = new byte[]{-31, 19, -13, -27, -107, 89, -109, 29, -118, 112, -26, 56, 72, 64, 70, 89, 46, 80, -31, -4, -30, -29, 40, -22, 58, 32, -24, -2, -70, -39, -31, -36, 11, -122, -13, -39, -24, -95, -17, -49, 50, -72, -22, -35, -22, -16};
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2815(String str, String str2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(m2811((-34) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (ImageFormat.getBitsPerPixel(0) - 7), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 159487882, (byte) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 172712495).intern(), str2);
            if (this.f2724.update(m2811(View.MeasureSpec.getMode(0) - 35, (short) ((ViewConfiguration.getTapTimeout() >> 16) - 69), (-159487872) - (Process.myTid() >> 22), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 172712483).intern(), contentValues, m2811((-35) - View.resolveSize(0, 0), (short) ((-117) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) - 159487879, (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 172712485 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new String[]{str}) == 0) {
                f2718 = (f2717 + 51) % 128;
                contentValues.put(m2811((-35) - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) (TextUtils.indexOf("", "", 0, 0) + 24), (ViewConfiguration.getEdgeSlop() >> 16) - 159487864, (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), Color.argb(0, 0, 0, 0) + 172712484).intern(), str);
                this.f2724.replace(m2811((-35) - KeyEvent.getDeadChar(0, 0), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 69), TextUtils.indexOf("", "", 0, 0) - 159487872, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), Gravity.getAbsoluteGravity(0, 0) + 172712484).intern(), null, contentValues);
            }
            int i10 = f2717 + 3;
            f2718 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 26 / 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m2816(String str) {
        f2717 = (f2718 + 57) % 128;
        this.f2724.delete(m2811((-35) - View.MeasureSpec.getMode(0), (short) (View.combineMeasuredStates(0, 0) - 69), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 159487872, (byte) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 172712484).intern(), m2811(MotionEvent.axisFromString("") - 34, (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 38), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 159487861, (byte) ('0' - AndroidCharacter.getMirror('0')), 172712484 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new String[]{str});
        f2717 = (f2718 + 113) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized int m2817(String str) {
        f2718 = (f2717 + 75) % 128;
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f2724.query(m2811((-35) - View.MeasureSpec.getMode(0), (short) (TextUtils.getTrimmedLength("") - 69), KeyEvent.getDeadChar(0, 0) - 159487872, (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 172712485 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new String[]{m2811((-35) - ExpandableListView.getPackedPositionType(0L), (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 28), ImageFormat.getBitsPerPixel(0) - 159487845, (byte) TextUtils.getOffsetBefore("", 0), 172712444 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()}, m2811(Color.alpha(0) - 35, (short) (33 - View.getDefaultSize(0, 0)), (-159487856) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 172712484 - ExpandableListView.getPackedPositionType(0L)).intern(), new String[]{str.replace(GMTDateParser.ANY, '%')}, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i10 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i10;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            f2718 = (f2717 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
            return 0;
        } finally {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized String m2813(String str) {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.f2724.query(m2811((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 35, (short) ((-69) - TextUtils.getCapsMode("", 0, 0)), (-159487871) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), 172712483 - ExpandableListView.getPackedPositionChild(0L)).intern(), f2721, m2811(View.MeasureSpec.getMode(0) - 35, (short) (View.resolveSizeAndState(0, 0, 0) - 118), (ViewConfiguration.getPressedStateDuration() >> 16) - 159487879, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 172712484 - View.resolveSizeAndState(0, 0, 0)).intern(), new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                f2718 = (f2717 + 49) % 128;
                try {
                    if (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2811(TextUtils.indexOf("", "", 0, 0) - 35, (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 8), Color.argb(0, 0, 0, 0) - 159487882, (byte) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) + 172712495).intern()));
                        int i10 = f2718 + 79;
                        f2717 = i10 % 128;
                        if (i10 % 2 != 0) {
                            cursorQuery.close();
                            return string;
                        }
                        cursorQuery.close();
                        throw null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                        f2717 = (f2718 + 73) % 128;
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized HashMap<String, String> m2814(String str, int i10) {
        String string;
        HashMap<String, String> map;
        f2718 = (f2717 + 95) % 128;
        Cursor cursorQuery = null;
        try {
            String strReplace = str.replace(GMTDateParser.ANY, '%');
            String strIntern = m2811((-36) - TextUtils.indexOf((CharSequence) "", '0'), (short) ('Q' - AndroidCharacter.getMirror('0')), (-159487856) - TextUtils.getOffsetAfter("", 0), (byte) Color.blue(0), 172712484 - TextUtils.getCapsMode("", 0, 0)).intern();
            String[] strArr = {strReplace};
            if (i10 <= 0) {
                f2718 = (f2717 + 77) % 128;
                string = null;
            } else {
                string = Integer.toString(i10);
            }
            cursorQuery = this.f2724.query(m2811((-35) - TextUtils.getCapsMode("", 0, 0), (short) ((-69) - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.lastIndexOf("", '0', 0) - 159487871, (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 172712484).intern(), f2721, strIntern, strArr, null, null, null, string);
            map = new HashMap<>();
            while (cursorQuery != null) {
                if (!cursorQuery.moveToNext()) {
                    break;
                }
                try {
                    map.put(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2811((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 35, (short) (24 - (Process.myPid() >> 22)), (-159487864) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 172712485).intern())), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(m2811((-34) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (short) ((-9) - TextUtils.lastIndexOf("", '0', 0, 0)), (-159487882) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) Color.green(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 172712495).intern())));
                } catch (IllegalArgumentException unused) {
                }
            }
            if (cursorQuery != null) {
                f2717 = (f2718 + 19) % 128;
                cursorQuery.close();
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
        return map;
    }
}
