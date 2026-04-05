package nf;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.v0;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e3.g;
import ef.i;
import ef.j;
import ef.l;
import java.nio.charset.Charset;
import java.util.List;
import mh.h0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: n, reason: collision with root package name */
    public final v0 f76063n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f76064o;

    /* renamed from: p, reason: collision with root package name */
    public final int f76065p;

    /* renamed from: q, reason: collision with root package name */
    public final int f76066q;

    /* renamed from: r, reason: collision with root package name */
    public final String f76067r;

    /* renamed from: s, reason: collision with root package name */
    public final float f76068s;

    /* renamed from: t, reason: collision with root package name */
    public final int f76069t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f76063n = new v0();
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f76065p = 0;
            this.f76066q = -1;
            this.f76067r = C.SANS_SERIF_NAME;
            this.f76064o = false;
            this.f76068s = 0.85f;
            this.f76069t = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f76065p = bArr[24];
        this.f76066q = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f76067r = "Serif".equals(n1.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
        int i10 = bArr[25] * 20;
        this.f76069t = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f76064o = z10;
        if (z10) {
            this.f76068s = n1.constrainValue(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f76068s = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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

    @Override // ef.i
    public final j c(byte[] bArr, int i10, boolean z10) throws l {
        String string;
        v0 v0Var = this.f76063n;
        v0Var.reset(bArr, i10);
        int i11 = 2;
        if (v0Var.bytesLeft() < 2) {
            throw new l("Unexpected subtitle format.");
        }
        int unsignedShort = v0Var.readUnsignedShort();
        if (unsignedShort == 0) {
            string = "";
        } else {
            int position = v0Var.getPosition();
            Charset utfCharsetFromBom = v0Var.readUtfCharsetFromBom();
            int position2 = unsignedShort - (v0Var.getPosition() - position);
            if (utfCharsetFromBom == null) {
                utfCharsetFromBom = h0.f74628c;
            }
            string = v0Var.readString(position2, utfCharsetFromBom);
        }
        if (string.isEmpty()) {
            return b.f76070c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        e(spannableStringBuilder, this.f76065p, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.f76066q, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i12 = 0;
        String str = this.f76067r;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fConstrainValue = this.f76068s;
        while (v0Var.bytesLeft() >= 8) {
            int position3 = v0Var.getPosition();
            int i13 = v0Var.readInt();
            int i14 = v0Var.readInt();
            if (i14 == 1937013100) {
                if (v0Var.bytesLeft() < i11) {
                    throw new l("Unexpected subtitle format.");
                }
                int unsignedShort2 = v0Var.readUnsignedShort();
                int i15 = i12;
                while (i15 < unsignedShort2) {
                    if (v0Var.bytesLeft() < 12) {
                        throw new l("Unexpected subtitle format.");
                    }
                    int unsignedShort3 = v0Var.readUnsignedShort();
                    int unsignedShort4 = v0Var.readUnsignedShort();
                    v0Var.skipBytes(i11);
                    int unsignedByte = v0Var.readUnsignedByte();
                    v0Var.skipBytes(1);
                    int i16 = v0Var.readInt();
                    if (unsignedShort4 > spannableStringBuilder.length()) {
                        StringBuilder sbT = o2.t(unsignedShort4, "Truncating styl end (", ") to cueText.length() (");
                        sbT.append(spannableStringBuilder.length());
                        sbT.append(").");
                        f0.w("Tx3gDecoder", sbT.toString());
                        unsignedShort4 = spannableStringBuilder.length();
                    }
                    int i17 = unsignedShort4;
                    if (unsignedShort3 >= i17) {
                        f0.w("Tx3gDecoder", o2.i(unsignedShort3, i17, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        e(spannableStringBuilder, unsignedByte, this.f76065p, unsignedShort3, i17, 0);
                        d(spannableStringBuilder, i16, this.f76066q, unsignedShort3, i17, 0);
                    }
                    i15++;
                    i11 = 2;
                }
            } else if (i14 == 1952608120 && this.f76064o) {
                i11 = 2;
                if (v0Var.bytesLeft() < 2) {
                    throw new l("Unexpected subtitle format.");
                }
                fConstrainValue = n1.constrainValue(v0Var.readUnsignedShort() / this.f76069t, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            v0Var.setPosition(position3 + i13);
            i12 = 0;
        }
        return new b(new ef.a().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build());
    }
}
