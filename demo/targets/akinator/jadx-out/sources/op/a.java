package op;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e3.g;
import hp.c;
import hp.i;
import hp.r;
import hp.s;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import io.bidmachine.media3.common.util.k;
import io.bidmachine.media3.common.util.m0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import nh.b5;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f79722a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79725d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79726e;

    /* renamed from: f, reason: collision with root package name */
    public final float f79727f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79728g;

    public a(List<byte[]> list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f79724c = 0;
            this.f79725d = -1;
            this.f79726e = C.SANS_SERIF_NAME;
            this.f79723b = false;
            this.f79727f = 0.85f;
            this.f79728g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f79724c = bArr[24];
        this.f79725d = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f79726e = "Serif".equals(a1.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
        int i10 = bArr[25] * 20;
        this.f79728g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f79723b = z10;
        if (z10) {
            this.f79727f = a1.constrainValue(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f79727f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
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

    @Override // hp.s
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void parse(byte[] bArr, r rVar, k kVar) {
        super.parse(bArr, rVar, kVar);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ i parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return super.parseToLegacySubtitle(bArr, i10, i11);
    }

    @Override // hp.s
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hp.s
    public void parse(byte[] bArr, int i10, int i11, r rVar, k kVar) {
        String string;
        int i12;
        int i13;
        m0 m0Var = this.f79722a;
        m0Var.reset(bArr, i10 + i11);
        m0Var.setPosition(i10);
        int i14 = 1;
        int i15 = 0;
        int i16 = 2;
        io.bidmachine.media3.common.util.a.checkArgument(m0Var.bytesLeft() >= 2);
        int unsignedShort = m0Var.readUnsignedShort();
        if (unsignedShort == 0) {
            string = "";
        } else {
            int position = m0Var.getPosition();
            Charset utfCharsetFromBom = m0Var.readUtfCharsetFromBom();
            int position2 = unsignedShort - (m0Var.getPosition() - position);
            if (utfCharsetFromBom == null) {
                utfCharsetFromBom = StandardCharsets.UTF_8;
            }
            string = m0Var.readString(position2, utfCharsetFromBom);
        }
        if (string.isEmpty()) {
            kVar.accept(new c(b5.of(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        b(spannableStringBuilder, this.f79724c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f79725d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f79726e;
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fConstrainValue = this.f79727f;
        while (m0Var.bytesLeft() >= 8) {
            int position3 = m0Var.getPosition();
            int i17 = m0Var.readInt();
            int i18 = m0Var.readInt();
            if (i18 == 1937013100) {
                io.bidmachine.media3.common.util.a.checkArgument(m0Var.bytesLeft() >= i16 ? i14 : i15);
                int unsignedShort2 = m0Var.readUnsignedShort();
                int i19 = i15;
                while (i19 < unsignedShort2) {
                    io.bidmachine.media3.common.util.a.checkArgument(m0Var.bytesLeft() >= 12 ? i14 : i15);
                    int unsignedShort3 = m0Var.readUnsignedShort();
                    int unsignedShort4 = m0Var.readUnsignedShort();
                    m0Var.skipBytes(i16);
                    int i20 = i19;
                    int unsignedByte = m0Var.readUnsignedByte();
                    m0Var.skipBytes(i14);
                    int i21 = m0Var.readInt();
                    if (unsignedShort4 > spannableStringBuilder.length()) {
                        StringBuilder sbT = o2.t(unsignedShort4, "Truncating styl end (", ") to cueText.length() (");
                        sbT.append(spannableStringBuilder.length());
                        sbT.append(").");
                        b0.w("Tx3gParser", sbT.toString());
                        unsignedShort4 = spannableStringBuilder.length();
                    }
                    if (unsignedShort3 >= unsignedShort4) {
                        b0.w("Tx3gParser", o2.i(unsignedShort3, unsignedShort4, "Ignoring styl with start (", ") >= end (", ")."));
                        i13 = i20;
                    } else {
                        i13 = i20;
                        int i22 = unsignedShort4;
                        b(spannableStringBuilder, unsignedByte, this.f79724c, unsignedShort3, i22, 0);
                        a(spannableStringBuilder, i21, this.f79725d, unsignedShort3, i22, 0);
                    }
                    i19 = i13 + 1;
                    i14 = 1;
                    i15 = 0;
                    i16 = 2;
                }
                i12 = i16;
            } else if (i18 == 1952608120 && this.f79723b) {
                i12 = 2;
                io.bidmachine.media3.common.util.a.checkArgument(m0Var.bytesLeft() >= 2);
                fConstrainValue = a1.constrainValue(m0Var.readUnsignedShort() / this.f79728g, 0.0f, 0.95f);
            } else {
                i12 = 2;
            }
            m0Var.setPosition(position3 + i17);
            i16 = i12;
            i14 = 1;
            i15 = 0;
        }
        kVar.accept(new c(b5.of(new in.a().setText(spannableStringBuilder).setLine(fConstrainValue, 0).setLineAnchor(0).build()), C.TIME_UNSET, C.TIME_UNSET));
    }
}
