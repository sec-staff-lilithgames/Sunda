package io.odeeo.internal.l0;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e3.g;
import io.odeeo.internal.d0.a;
import io.odeeo.internal.d0.e;
import io.odeeo.internal.d0.f;
import io.odeeo.internal.d0.h;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.x;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: o, reason: collision with root package name */
    public final x f64585o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f64586p;

    /* renamed from: q, reason: collision with root package name */
    public final int f64587q;

    /* renamed from: r, reason: collision with root package name */
    public final int f64588r;

    /* renamed from: s, reason: collision with root package name */
    public final String f64589s;

    /* renamed from: t, reason: collision with root package name */
    public final float f64590t;

    /* renamed from: u, reason: collision with root package name */
    public final int f64591u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f64585o = new x();
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f64587q = 0;
            this.f64588r = -1;
            this.f64589s = C.SANS_SERIF_NAME;
            this.f64586p = false;
            this.f64590t = 0.85f;
            this.f64591u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f64587q = bArr[24];
        this.f64588r = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f64589s = "Serif".equals(g0.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
        int i10 = bArr[25] * 20;
        this.f64591u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f64586p = z10;
        if (z10) {
            this.f64590t = g0.constrainValue(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f64590t = 0.85f;
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    g.s(3, spannableStringBuilder, i12, i13, i15);
                } else {
                    g.s(1, spannableStringBuilder, i12, i13, i15);
                }
            } else if (z11) {
                g.s(2, spannableStringBuilder, i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                g.u(spannableStringBuilder, i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            g.s(0, spannableStringBuilder, i12, i13, i15);
        }
    }

    @Override // io.odeeo.internal.d0.e
    public f a(byte[] bArr, int i10, boolean z10) throws h {
        this.f64585o.reset(bArr, i10);
        String strA = a(this.f64585o);
        if (strA.isEmpty()) {
            return b.f64592b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        b(spannableStringBuilder, this.f64587q, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f64588r, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f64589s, 0, spannableStringBuilder.length());
        float fConstrainValue = this.f64590t;
        while (this.f64585o.bytesLeft() >= 8) {
            int position = this.f64585o.getPosition();
            int i11 = this.f64585o.readInt();
            int i12 = this.f64585o.readInt();
            if (i12 == 1937013100) {
                a(this.f64585o.bytesLeft() >= 2);
                int unsignedShort = this.f64585o.readUnsignedShort();
                for (int i13 = 0; i13 < unsignedShort; i13++) {
                    a(this.f64585o, spannableStringBuilder);
                }
            } else if (i12 == 1952608120 && this.f64586p) {
                a(this.f64585o.bytesLeft() >= 2);
                fConstrainValue = g0.constrainValue(this.f64585o.readUnsignedShort() / this.f64591u, 0.0f, 0.95f);
            }
            this.f64585o.setPosition(position + i11);
        }
        return new b(new a.b().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build());
    }

    public static String a(x xVar) throws h {
        char cPeekChar;
        a(xVar.bytesLeft() >= 2);
        int unsignedShort = xVar.readUnsignedShort();
        if (unsignedShort == 0) {
            return "";
        }
        if (xVar.bytesLeft() >= 2 && ((cPeekChar = xVar.peekChar()) == 65279 || cPeekChar == 65534)) {
            return xVar.readString(unsignedShort, io.odeeo.internal.t0.e.f66409f);
        }
        return xVar.readString(unsignedShort, io.odeeo.internal.t0.e.f66406c);
    }

    public final void a(x xVar, SpannableStringBuilder spannableStringBuilder) throws h {
        a(xVar.bytesLeft() >= 12);
        int unsignedShort = xVar.readUnsignedShort();
        int unsignedShort2 = xVar.readUnsignedShort();
        xVar.skipBytes(2);
        int unsignedByte = xVar.readUnsignedByte();
        xVar.skipBytes(1);
        int i10 = xVar.readInt();
        if (unsignedShort2 > spannableStringBuilder.length()) {
            StringBuilder sbT = o2.t(unsignedShort2, "Truncating styl end (", ") to cueText.length() (");
            sbT.append(spannableStringBuilder.length());
            sbT.append(").");
            p.w("Tx3gDecoder", sbT.toString());
            unsignedShort2 = spannableStringBuilder.length();
        }
        int i11 = unsignedShort2;
        if (unsignedShort >= i11) {
            p.w("Tx3gDecoder", o2.i(unsignedShort, i11, "Ignoring styl with start (", ") >= end (", ")."));
        } else {
            b(spannableStringBuilder, unsignedByte, this.f64587q, unsignedShort, i11, 0);
            a(spannableStringBuilder, i10, this.f64588r, unsignedShort, i11, 0);
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    public static void a(boolean z10) throws h {
        if (!z10) {
            throw new h("Unexpected subtitle format.");
        }
    }
}
