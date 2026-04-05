package kc;

import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.l4;
import androidx.datastore.preferences.protobuf.m4;
import androidx.datastore.preferences.protobuf.u1;
import bi.b0;
import bi.q;
import bi.r;
import com.applovin.shadow.okio.Segment;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import j$.time.Duration;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.d0;
import org.xmlpull.v1.XmlPullParserException;
import s4.k0;
import s4.l0;
import s4.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static Field f70795a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f70796b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f70797c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f70798d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f70799e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f70800f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f70801g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f70802h;

    public static int F(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static int G(int i10) {
        return (i10 + 1) * (i10 < 32 ? 4 : 2);
    }

    public static int J(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15 = i11;
        if (i10 != 0) {
            if (i15 >= i12) {
                return i10;
            }
            byte b12 = (byte) i10;
            if (b12 < -32) {
                if (b12 < -62) {
                    return -1;
                }
                int i16 = i15 + 1;
                if (byteBuffer.get(i11) > -65) {
                    return -1;
                }
                i15 = i16;
            } else if (b12 < -16) {
                byte b13 = (byte) (~(i10 >> 8));
                if (b13 == 0) {
                    i14 = i15 + 1;
                    b11 = byteBuffer.get(i11);
                    if (i14 >= i12) {
                        return m4.f(b12, b11);
                    }
                } else {
                    b11 = b13;
                    i14 = i15;
                }
                if (b11 > -65) {
                    return -1;
                }
                if (b12 == -32 && b11 < -96) {
                    return -1;
                }
                if (b12 == -19 && b11 >= -96) {
                    return -1;
                }
                i15 = i14 + 1;
                if (byteBuffer.get(i14) > -65) {
                    return -1;
                }
            } else {
                byte b14 = (byte) (~(i10 >> 8));
                if (b14 == 0) {
                    i13 = i15 + 1;
                    b14 = byteBuffer.get(i11);
                    if (i13 >= i12) {
                        return m4.f(b12, b14);
                    }
                    b10 = 0;
                } else {
                    b10 = (byte) (i10 >> 16);
                    i13 = i15;
                }
                if (b10 == 0) {
                    int i17 = i13 + 1;
                    byte b15 = byteBuffer.get(i13);
                    if (i17 >= i12) {
                        return m4.g(b12, b14, b15);
                    }
                    b10 = b15;
                    i13 = i17;
                }
                if (b14 > -65) {
                    return -1;
                }
                if ((((b14 + 112) + (b12 << 28)) >> 30) != 0 || b10 > -65) {
                    return -1;
                }
                i15 = i13 + 1;
                if (byteBuffer.get(i13) > -65) {
                    return -1;
                }
            }
        }
        p pVar = m4.f5958a;
        int i18 = i12 - 7;
        int i19 = i15;
        while (i19 < i18 && (byteBuffer.getLong(i19) & (-9187201950435737472L)) == 0) {
            i19 += 8;
        }
        int i20 = (i19 - i15) + i15;
        while (i20 < i12) {
            int i21 = i20 + 1;
            byte b16 = byteBuffer.get(i20);
            if (b16 >= 0) {
                i20 = i21;
            } else if (b16 < -32) {
                if (i21 >= i12) {
                    return b16;
                }
                if (b16 < -62 || byteBuffer.get(i21) > -65) {
                    return -1;
                }
                i20 += 2;
            } else if (b16 < -16) {
                if (i21 >= i12 - 1) {
                    return m4.b(byteBuffer, b16, i21, i12 - i21);
                }
                int i22 = i20 + 2;
                byte b17 = byteBuffer.get(i21);
                if (b17 > -65) {
                    return -1;
                }
                if (b16 == -32 && b17 < -96) {
                    return -1;
                }
                if ((b16 == -19 && b17 >= -96) || byteBuffer.get(i22) > -65) {
                    return -1;
                }
                i20 += 3;
            } else {
                if (i21 >= i12 - 2) {
                    return m4.b(byteBuffer, b16, i21, i12 - i21);
                }
                int i23 = i20 + 2;
                byte b18 = byteBuffer.get(i21);
                if (b18 > -65) {
                    return -1;
                }
                if ((((b18 + 112) + (b16 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i24 = i20 + 3;
                if (byteBuffer.get(i23) > -65) {
                    return -1;
                }
                i20 += 4;
                if (byteBuffer.get(i24) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static t4.f M(InputStream inputStream) throws IOException {
        k0 k0Var = new k0(inputStream);
        l0 l0VarO = o(k0Var);
        k0Var.skip((int) (l0VarO.f85424a - k0Var.getPosition()));
        long j10 = l0VarO.f85425b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) j10);
        int i10 = inputStream.read(byteBufferAllocate.array());
        if (i10 == j10) {
            return t4.f.getRootAsMetadataList(byteBufferAllocate);
        }
        throw new IOException("Needed " + j10 + " bytes, got " + i10);
    }

    public static void N(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = p3.a.wrap(drawable).mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static int O(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iG = d0.G(obj);
        int i13 = iG & i10;
        int iR = R(i13, obj3);
        if (iR != 0) {
            int i14 = ~i10;
            int i15 = iG & i14;
            int i16 = -1;
            while (true) {
                i11 = iR - 1;
                i12 = iArr[i11];
                if ((i12 & i14) == i15 && Objects.equals(obj, objArr[i11]) && (objArr2 == null || Objects.equals(obj2, objArr2[i11]))) {
                    break;
                }
                int i17 = i12 & i10;
                if (i17 == 0) {
                    break;
                }
                i16 = i11;
                iR = i17;
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                S(i13, i18, obj3);
                return i11;
            }
            iArr[i16] = F(iArr[i16], i18, i10);
            return i11;
        }
        return -1;
    }

    public static void P(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z10 = onLongClickListener != null;
        boolean z11 = zHasOnClickListeners || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        checkableImageButton.setImportantForAccessibility(z11 ? 1 : 2);
    }

    public static int R(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void S(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static int T(int i10) {
        int iMax = Math.max(i10 + 1, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0d * iHighestOneBit)) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        return Math.max(4, iHighestOneBit);
    }

    public static long U(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static final String X(String str, XmlResourceParser xmlResourceParser) {
        for (int i10 = 0; i10 < xmlResourceParser.getAttributeCount(); i10++) {
            if (xmlResourceParser.getAttributeName(i10).equals(str)) {
                return xmlResourceParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static final void Y(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = p3.a.wrap(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void b(float f10, float[] fArr) {
        if (f10 <= 0.5f) {
            fArr[0] = 1.0f - (f10 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f10 * 2.0f) - 1.0f;
        }
    }

    public static ImageView.ScaleType e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static Object f(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(a.b.e(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static String h(ByteBuffer byteBuffer, int i10, int i11) throws u1 {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (b11 >= 0) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = byteBuffer.get(i17);
                    if (b12 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw u1.c();
                }
                i10 += 2;
                jh.i.e(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw u1.c();
                }
                int i18 = i10 + 2;
                i10 += 3;
                jh.i.f(b11, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw u1.c();
                }
                byte b13 = byteBuffer.get(i15);
                int i19 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                jh.i.a(b11, b13, b14, byteBuffer.get(i19), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static void j(ArrayList arrayList) {
        Set<bi.o> set;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bi.c cVar = (bi.c) it.next();
            bi.o oVar = new bi.o(cVar);
            for (b0 b0Var : cVar.getProvidedInterfaces()) {
                boolean zIsValue = cVar.isValue();
                bi.p pVar = new bi.p(b0Var, !zIsValue);
                if (!map.containsKey(pVar)) {
                    map.put(pVar, new HashSet());
                }
                Set set2 = (Set) map.get(pVar);
                if (!set2.isEmpty() && zIsValue) {
                    throw new IllegalArgumentException("Multiple components provide " + b0Var + ".");
                }
                set2.add(oVar);
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            for (bi.o oVar2 : (Set) it2.next()) {
                for (q qVar : oVar2.f9583a.getDependencies()) {
                    if (qVar.isDirectInjection() && (set = (Set) map.get(new bi.p(qVar.getInterface(), qVar.isSet()))) != null) {
                        for (bi.o oVar3 : set) {
                            oVar2.f9584b.add(oVar3);
                            oVar3.f9585c.add(oVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = map.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            bi.o oVar4 = (bi.o) it4.next();
            if (oVar4.f9585c.isEmpty()) {
                hashSet2.add(oVar4);
            }
        }
        int i10 = 0;
        while (!hashSet2.isEmpty()) {
            bi.o oVar5 = (bi.o) hashSet2.iterator().next();
            hashSet2.remove(oVar5);
            i10++;
            Iterator it5 = oVar5.f9584b.iterator();
            while (it5.hasNext()) {
                bi.o oVar6 = (bi.o) it5.next();
                oVar6.f9585c.remove(oVar5);
                if (oVar6.f9585c.isEmpty()) {
                    hashSet2.add(oVar6);
                }
            }
        }
        if (i10 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            bi.o oVar7 = (bi.o) it6.next();
            if (!oVar7.f9585c.isEmpty() && !oVar7.f9584b.isEmpty()) {
                arrayList2.add(oVar7.f9583a);
            }
        }
        throw new r(arrayList2);
    }

    public static void l(String str, ByteBuffer byteBuffer) {
        int i10;
        int length = str.length();
        int iPosition = byteBuffer.position();
        int i11 = 0;
        while (i11 < length) {
            try {
                char cCharAt = str.charAt(i11);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i11, (byte) cCharAt);
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i11 == length) {
            byteBuffer.position(iPosition + i11);
            return;
        }
        iPosition += i11;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i12 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i12, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i12;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i12;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i13 = i11 + 1;
                    if (i13 != length) {
                        try {
                            char cCharAt3 = str.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i14 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    i10 = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i14;
                                    i11 = i13;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                                try {
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i10, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i11 = i13;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i11 = i13;
                                    iPosition = i10;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i11 = i13;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new l4(i11, length);
                }
                int i15 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i11++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public static void n(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain ".concat(str));
        }
    }

    public static l0 o(m0 m0Var) throws IOException {
        long unsignedInt;
        m0Var.skip(4);
        int unsignedShort = m0Var.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        m0Var.skip(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                unsignedInt = -1;
                break;
            }
            int tag = m0Var.readTag();
            m0Var.skip(4);
            unsignedInt = m0Var.readUnsignedInt();
            m0Var.skip(4);
            if (1835365473 == tag) {
                break;
            }
            i10++;
        }
        if (unsignedInt != -1) {
            m0Var.skip((int) (unsignedInt - m0Var.getPosition()));
            m0Var.skip(12);
            long unsignedInt2 = m0Var.readUnsignedInt();
            for (int i11 = 0; i11 < unsignedInt2; i11++) {
                int tag2 = m0Var.readTag();
                long unsignedInt3 = m0Var.readUnsignedInt();
                long unsignedInt4 = m0Var.readUnsignedInt();
                if (1164798569 == tag2 || 1701669481 == tag2) {
                    return new l0(unsignedInt3 + unsignedInt, unsignedInt4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int r(int r5) {
        /*
            r0 = -1
            if (r5 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L15
            switch(r5) {
                case 21: goto L14;
                case 22: goto L12;
                case 23: goto L14;
                case 24: goto L12;
                case 25: goto L10;
                case 26: goto L14;
                case 27: goto L12;
                default: goto Lf;
            }
        Lf:
            goto L15
        L10:
            r5 = r4
            goto L15
        L12:
            r5 = 4
            goto L15
        L14:
            r5 = r3
        L15:
            r2 = 30
            if (r1 >= r2) goto L2e
            r2 = 12
            if (r5 == r2) goto L2c
            r2 = 13
            if (r5 == r2) goto L2f
            r2 = 16
            if (r5 == r2) goto L2c
            r2 = 17
            if (r5 == r2) goto L2a
            goto L2e
        L2a:
            r3 = r4
            goto L2f
        L2c:
            r3 = 1
            goto L2f
        L2e:
            r3 = r5
        L2f:
            r5 = 27
            if (r1 >= r5) goto L3e
            r5 = 7
            if (r3 == r5) goto L3f
            r5 = 8
            if (r3 == r5) goto L3f
            r5 = 9
            if (r3 == r5) goto L3f
        L3e:
            r0 = r3
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kc.p.r(int):int");
    }

    public static InputStream t(String str) throws IOException {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(20000);
            uRLConnectionOpenConnection.setReadTimeout(20000);
            try {
                if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setSSLSocketFactory(new xp.i(httpsURLConnection.getSSLSocketFactory()));
                }
            } catch (Exception e10) {
                nm.a.w(e10);
            }
            uRLConnectionOpenConnection.connect();
            return uRLConnectionOpenConnection.getInputStream();
        } catch (Exception unused) {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.scheme("http");
            URLConnection uRLConnectionOpenConnection2 = new URL(builderBuildUpon.build().toString()).openConnection();
            uRLConnectionOpenConnection2.setConnectTimeout(20000);
            uRLConnectionOpenConnection2.setReadTimeout(20000);
            uRLConnectionOpenConnection2.connect();
            return uRLConnectionOpenConnection2.getInputStream();
        }
    }

    public static void z(InputStream inputStream, File file) throws Throwable {
        byte[] bArr = new byte[Segment.SIZE];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        hi.j.closeQuietly(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    hi.j.closeQuietly(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public abstract boolean A(float f10);

    public abstract boolean B(Class cls);

    public abstract boolean C(View view);

    public abstract boolean D(float f10, float f11);

    public boolean E(byte[] bArr, int i10, int i11) {
        return I(0, bArr, i10, i11) == 0;
    }

    public int H(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        if (!byteBuffer.hasArray()) {
            return byteBuffer.isDirect() ? K(i10, byteBuffer, i11, i12) : J(i10, byteBuffer, i11, i12);
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        return I(i10, byteBuffer.array(), i11 + iArrayOffset, iArrayOffset + i12);
    }

    public abstract int I(int i10, byte[] bArr, int i11, int i12);

    public abstract int K(int i10, ByteBuffer byteBuffer, int i11, int i12);

    public abstract void L(String str);

    public abstract boolean Q(View view, float f10);

    public abstract void V(ViewGroup.MarginLayoutParams marginLayoutParams, int i10);

    public abstract void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11);

    public abstract int c(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float d(int i10);

    public abstract String g(byte[] bArr, int i10, int i11);

    public abstract Method getAccessor(Class cls, Field field);

    public abstract Constructor getCanonicalRecordConstructor(Class cls);

    public abstract int getParentInnerEdge(CoordinatorLayout coordinatorLayout);

    public abstract String i(ByteBuffer byteBuffer, int i10, int i11);

    public abstract int k(String str, byte[] bArr, int i10, int i11);

    public abstract void m(String str, ByteBuffer byteBuffer);

    public abstract int p(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int q();

    public abstract int s();

    public abstract int u();

    public abstract int v();

    public abstract int w(View view);

    public abstract String[] x(Class cls);

    public abstract int y();
}
