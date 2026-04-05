package a2;

import android.os.Parcel;
import android.util.Base64;
import r2.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final Parcel f3459a;

    public b3(String string) {
        kotlin.jvm.internal.e0.checkNotNullParameter(string, "string");
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f3459a = parcelObtain;
        byte[] bArrDecode = Base64.decode(string, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    /* renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m5decodeColor0d7_KjU() {
        return j1.m0.m4854constructorimpl(tu.o0.m7081constructorimpl(this.f3459a.readLong()));
    }

    /* renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m6decodeFontStyle_LCdwA() {
        byte b10 = this.f3459a.readByte();
        return b10 == 0 ? l2.y0.f72394b.m5480getNormal_LCdwA() : b10 == 1 ? l2.y0.f72394b.m5479getItalic_LCdwA() : l2.y0.f72394b.m5480getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m7decodeFontSynthesisGVVA2EU() {
        byte b10 = this.f3459a.readByte();
        return b10 == 0 ? l2.a1.f72244b.m5490getNoneGVVA2EU() : b10 == 1 ? l2.a1.f72244b.m5489getAllGVVA2EU() : b10 == 3 ? l2.a1.f72244b.m5491getStyleGVVA2EU() : b10 == 2 ? l2.a1.f72244b.m5492getWeightGVVA2EU() : l2.a1.f72244b.m5490getNoneGVVA2EU();
    }

    public final l2.c1 decodeFontWeight() {
        return new l2.c1(this.f3459a.readInt());
    }

    public final g2.r1 decodeSpanStyle() {
        c4 c4Var = new c4(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (true) {
            Parcel parcel = this.f3459a;
            if (parcel.dataAvail() > 1) {
                byte b10 = parcel.readByte();
                if (b10 != 1) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 != 4) {
                                if (b10 != 5) {
                                    if (b10 != 6) {
                                        if (b10 != 7) {
                                            if (b10 != 8) {
                                                if (b10 != 9) {
                                                    if (b10 != 10) {
                                                        if (b10 != 11) {
                                                            if (b10 == 12) {
                                                                if (parcel.dataAvail() < 20) {
                                                                    break;
                                                                }
                                                                c4Var.setShadow(new j1.d2(m5decodeColor0d7_KjU(), i1.i.Offset(parcel.readFloat(), parcel.readFloat()), parcel.readFloat(), null));
                                                            } else {
                                                                continue;
                                                            }
                                                        } else {
                                                            if (parcel.dataAvail() < 4) {
                                                                break;
                                                            }
                                                            int i10 = parcel.readInt();
                                                            n.a aVar = r2.n.f83709b;
                                                            boolean z10 = (aVar.getLineThrough().getMask() & i10) != 0;
                                                            boolean z11 = (i10 & aVar.getUnderline().getMask()) != 0;
                                                            c4Var.setTextDecoration((z10 && z11) ? aVar.combine(uu.p0.listOf((Object[]) new r2.n[]{aVar.getLineThrough(), aVar.getUnderline()})) : z10 ? aVar.getLineThrough() : z11 ? aVar.getUnderline() : aVar.getNone());
                                                        }
                                                    } else {
                                                        if (parcel.dataAvail() < 8) {
                                                            break;
                                                        }
                                                        c4Var.m17setBackground8_81llA(m5decodeColor0d7_KjU());
                                                    }
                                                } else {
                                                    if (parcel.dataAvail() < 8) {
                                                        break;
                                                    }
                                                    c4Var.setTextGeometricTransform(new r2.v(parcel.readFloat(), parcel.readFloat()));
                                                }
                                            } else {
                                                if (parcel.dataAvail() < 4) {
                                                    break;
                                                }
                                                c4Var.m18setBaselineShift_isdbwI(r2.b.m6031boximpl(r2.b.m6032constructorimpl(parcel.readFloat())));
                                            }
                                        } else {
                                            if (parcel.dataAvail() < 5) {
                                                break;
                                            }
                                            c4Var.m23setLetterSpacingR2X_6o(m8decodeTextUnitXSAIIZE());
                                        }
                                    } else {
                                        c4Var.setFontFeatureSettings(parcel.readString());
                                    }
                                } else {
                                    if (parcel.dataAvail() < 1) {
                                        break;
                                    }
                                    c4Var.m22setFontSynthesistDdu0R4(l2.a1.m5423boximpl(m7decodeFontSynthesisGVVA2EU()));
                                }
                            } else {
                                if (parcel.dataAvail() < 1) {
                                    break;
                                }
                                c4Var.m21setFontStylemLjRB2g(l2.y0.m5482boximpl(m6decodeFontStyle_LCdwA()));
                            }
                        } else {
                            if (parcel.dataAvail() < 4) {
                                break;
                            }
                            c4Var.setFontWeight(decodeFontWeight());
                        }
                    } else {
                        if (parcel.dataAvail() < 5) {
                            break;
                        }
                        c4Var.m20setFontSizeR2X_6o(m8decodeTextUnitXSAIIZE());
                    }
                } else {
                    if (parcel.dataAvail() < 8) {
                        break;
                    }
                    c4Var.m19setColor8_81llA(m5decodeColor0d7_KjU());
                }
            } else {
                break;
            }
        }
        return c4Var.toSpanStyle();
    }

    /* renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m8decodeTextUnitXSAIIZE() {
        Parcel parcel = this.f3459a;
        byte b10 = parcel.readByte();
        long jM6742getSpUIouoOA = b10 == 1 ? s2.c0.f85325b.m6742getSpUIouoOA() : b10 == 2 ? s2.c0.f85325b.m6741getEmUIouoOA() : s2.c0.f85325b.m6743getUnspecifiedUIouoOA();
        return s2.c0.m6765equalsimpl0(jM6742getSpUIouoOA, s2.c0.f85325b.m6743getUnspecifiedUIouoOA()) ? s2.z.f85366b.m6983getUnspecifiedXSAIIZE() : s2.a0.m6724TextUnitanM5pPY(parcel.readFloat(), jM6742getSpUIouoOA);
    }
}
