package androidx.constraintlayout.widget;

import android.util.Log;
import androidx.constraintlayout.widget.k;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int[] f5413a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5414b;

    /* renamed from: c, reason: collision with root package name */
    public int f5415c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5416d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f5417e;

    /* renamed from: f, reason: collision with root package name */
    public int f5418f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f5419g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f5420h;

    /* renamed from: i, reason: collision with root package name */
    public int f5421i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f5422j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f5423k;

    /* renamed from: l, reason: collision with root package name */
    public int f5424l;

    public final void a(int i10, float f10) {
        int i11 = this.f5418f;
        int[] iArr = this.f5416d;
        if (i11 >= iArr.length) {
            this.f5416d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f5417e;
            this.f5417e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5416d;
        int i12 = this.f5418f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f5417e;
        this.f5418f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f5415c;
        int[] iArr = this.f5413a;
        if (i12 >= iArr.length) {
            this.f5413a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f5414b;
            this.f5414b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f5413a;
        int i13 = this.f5415c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f5414b;
        this.f5415c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f5421i;
        int[] iArr = this.f5419g;
        if (i11 >= iArr.length) {
            this.f5419g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f5420h;
            this.f5420h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f5419g;
        int i12 = this.f5421i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f5420h;
        this.f5421i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f5424l;
        int[] iArr = this.f5422j;
        if (i11 >= iArr.length) {
            this.f5422j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f5423k;
            this.f5423k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f5422j;
        int i12 = this.f5424l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f5423k;
        this.f5424l = i12 + 1;
        zArr2[i12] = z10;
    }

    public final void e(k.a aVar) {
        for (int i10 = 0; i10 < this.f5415c; i10++) {
            int i11 = this.f5413a[i10];
            int i12 = this.f5414b[i10];
            int[] iArr = k.f5425i;
            if (i11 == 6) {
                aVar.f5440e.D = i12;
            } else if (i11 == 7) {
                aVar.f5440e.E = i12;
            } else if (i11 == 8) {
                aVar.f5440e.K = i12;
            } else if (i11 == 27) {
                aVar.f5440e.F = i12;
            } else if (i11 == 28) {
                aVar.f5440e.H = i12;
            } else if (i11 == 41) {
                aVar.f5440e.W = i12;
            } else if (i11 == 42) {
                aVar.f5440e.X = i12;
            } else if (i11 == 61) {
                aVar.f5440e.A = i12;
            } else if (i11 == 62) {
                aVar.f5440e.B = i12;
            } else if (i11 == 72) {
                aVar.f5440e.f5458g0 = i12;
            } else if (i11 == 73) {
                aVar.f5440e.f5460h0 = i12;
            } else if (i11 == 2) {
                aVar.f5440e.J = i12;
            } else if (i11 == 31) {
                aVar.f5440e.L = i12;
            } else if (i11 == 34) {
                aVar.f5440e.I = i12;
            } else if (i11 == 38) {
                aVar.f5436a = i12;
            } else if (i11 == 64) {
                aVar.f5439d.f5489b = i12;
            } else if (i11 == 66) {
                aVar.f5439d.f5493f = i12;
            } else if (i11 == 76) {
                aVar.f5439d.f5492e = i12;
            } else if (i11 == 78) {
                aVar.f5438c.f5503c = i12;
            } else if (i11 == 97) {
                aVar.f5440e.f5476p0 = i12;
            } else if (i11 == 93) {
                aVar.f5440e.M = i12;
            } else if (i11 != 94) {
                switch (i11) {
                    case 11:
                        aVar.f5440e.Q = i12;
                        break;
                    case 12:
                        aVar.f5440e.R = i12;
                        break;
                    case 13:
                        aVar.f5440e.N = i12;
                        break;
                    case 14:
                        aVar.f5440e.P = i12;
                        break;
                    case 15:
                        aVar.f5440e.S = i12;
                        break;
                    case 16:
                        aVar.f5440e.O = i12;
                        break;
                    case 17:
                        aVar.f5440e.f5453e = i12;
                        break;
                    case 18:
                        aVar.f5440e.f5455f = i12;
                        break;
                    default:
                        switch (i11) {
                            case 21:
                                aVar.f5440e.f5451d = i12;
                                break;
                            case 22:
                                aVar.f5438c.f5502b = i12;
                                break;
                            case 23:
                                aVar.f5440e.f5449c = i12;
                                break;
                            case 24:
                                aVar.f5440e.G = i12;
                                break;
                            default:
                                switch (i11) {
                                    case 54:
                                        aVar.f5440e.Y = i12;
                                        break;
                                    case 55:
                                        aVar.f5440e.Z = i12;
                                        break;
                                    case 56:
                                        aVar.f5440e.f5446a0 = i12;
                                        break;
                                    case 57:
                                        aVar.f5440e.f5448b0 = i12;
                                        break;
                                    case 58:
                                        aVar.f5440e.f5450c0 = i12;
                                        break;
                                    case 59:
                                        aVar.f5440e.f5452d0 = i12;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 82:
                                                aVar.f5439d.f5490c = i12;
                                                break;
                                            case 83:
                                                aVar.f5441f.f5515i = i12;
                                                break;
                                            case 84:
                                                aVar.f5439d.f5497j = i12;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        aVar.f5439d.f5499l = i12;
                                                        break;
                                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                                        aVar.f5439d.f5500m = i12;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                        }
                                }
                        }
                }
            } else {
                aVar.f5440e.T = i12;
            }
        }
        for (int i13 = 0; i13 < this.f5418f; i13++) {
            int i14 = this.f5416d[i13];
            float f10 = this.f5417e[i13];
            int[] iArr2 = k.f5425i;
            if (i14 == 19) {
                aVar.f5440e.f5457g = f10;
            } else if (i14 == 20) {
                aVar.f5440e.f5484x = f10;
            } else if (i14 == 37) {
                aVar.f5440e.f5485y = f10;
            } else if (i14 == 60) {
                aVar.f5441f.f5508b = f10;
            } else if (i14 == 63) {
                aVar.f5440e.C = f10;
            } else if (i14 == 79) {
                aVar.f5439d.f5494g = f10;
            } else if (i14 == 85) {
                aVar.f5439d.f5496i = f10;
            } else if (i14 != 87) {
                if (i14 == 39) {
                    aVar.f5440e.V = f10;
                } else if (i14 != 40) {
                    switch (i14) {
                        case 43:
                            aVar.f5438c.f5504d = f10;
                            break;
                        case 44:
                            k.e eVar = aVar.f5441f;
                            eVar.f5520n = f10;
                            eVar.f5519m = true;
                            break;
                        case 45:
                            aVar.f5441f.f5509c = f10;
                            break;
                        case 46:
                            aVar.f5441f.f5510d = f10;
                            break;
                        case 47:
                            aVar.f5441f.f5511e = f10;
                            break;
                        case 48:
                            aVar.f5441f.f5512f = f10;
                            break;
                        case 49:
                            aVar.f5441f.f5513g = f10;
                            break;
                        case 50:
                            aVar.f5441f.f5514h = f10;
                            break;
                        case 51:
                            aVar.f5441f.f5516j = f10;
                            break;
                        case 52:
                            aVar.f5441f.f5517k = f10;
                            break;
                        case 53:
                            aVar.f5441f.f5518l = f10;
                            break;
                        default:
                            switch (i14) {
                                case TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER /* 67 */:
                                    aVar.f5439d.f5495h = f10;
                                    break;
                                case TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER /* 68 */:
                                    aVar.f5438c.f5505e = f10;
                                    break;
                                case TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER /* 69 */:
                                    aVar.f5440e.f5454e0 = f10;
                                    break;
                                case TokenParametersOuterClass$TokenParameters.COPPAAPPLIES_FIELD_NUMBER /* 70 */:
                                    aVar.f5440e.f5456f0 = f10;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                    }
                } else {
                    aVar.f5440e.U = f10;
                }
            }
        }
        for (int i15 = 0; i15 < this.f5421i; i15++) {
            int i16 = this.f5419g[i15];
            String str = this.f5420h[i15];
            int[] iArr3 = k.f5425i;
            if (i16 == 5) {
                aVar.f5440e.f5486z = str;
            } else if (i16 == 65) {
                aVar.f5439d.f5491d = str;
            } else if (i16 == 74) {
                k.b bVar = aVar.f5440e;
                bVar.f5466k0 = str;
                bVar.f5464j0 = null;
            } else if (i16 == 77) {
                aVar.f5440e.f5468l0 = str;
            } else if (i16 != 87) {
                if (i16 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    aVar.f5439d.f5498k = str;
                }
            }
        }
        for (int i17 = 0; i17 < this.f5424l; i17++) {
            int i18 = this.f5422j[i17];
            boolean z10 = this.f5423k[i17];
            int[] iArr4 = k.f5425i;
            if (i18 == 44) {
                aVar.f5441f.f5519m = z10;
            } else if (i18 == 75) {
                aVar.f5440e.f5474o0 = z10;
            } else if (i18 != 87) {
                if (i18 == 80) {
                    aVar.f5440e.f5470m0 = z10;
                } else if (i18 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    aVar.f5440e.f5472n0 = z10;
                }
            }
        }
    }
}
