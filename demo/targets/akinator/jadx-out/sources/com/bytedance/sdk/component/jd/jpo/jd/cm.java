package com.bytedance.sdk.component.jd.jpo.jd;

import a.b;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.ktor.util.date.GMTDateParser;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements Serializable, Comparable<cm> {

    /* renamed from: cm, reason: collision with root package name */
    final byte[] f18565cm;

    /* renamed from: jj, reason: collision with root package name */
    transient String f18566jj;
    transient int my;
    static final char[] jpo = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    /* renamed from: jd, reason: collision with root package name */
    public static final Charset f18564jd = Charset.forName(C.UTF8_NAME);
    public static final cm wqx = jpo(new byte[0]);

    public cm(byte[] bArr) {
        this.f18565cm = bArr;
    }

    public static cm jpo(byte... bArr) {
        if (bArr != null) {
            return new cm((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public byte[] cm() {
        return (byte[]) this.f18565cm.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cm) {
            cm cmVar = (cm) obj;
            int iWqx = cmVar.wqx();
            byte[] bArr = this.f18565cm;
            if (iWqx == bArr.length && cmVar.jpo(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.my;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f18565cm);
        this.my = iHashCode;
        return iHashCode;
    }

    public String jd() {
        byte[] bArr = this.f18565cm;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = jpo;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public String toString() {
        if (this.f18565cm.length == 0) {
            return "[size=0]";
        }
        String strJpo = jpo();
        int iJpo = jpo(strJpo, 64);
        if (iJpo != -1) {
            String strReplace = strJpo.substring(0, iJpo).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iJpo >= strJpo.length()) {
                return b.l("[text=", strReplace, C3191e4.i.f36531e);
            }
            return "[size=" + this.f18565cm.length + " text=" + strReplace + "…]";
        }
        if (this.f18565cm.length <= 64) {
            return "[hex=" + jd() + C3191e4.i.f36531e;
        }
        return "[size=" + this.f18565cm.length + " hex=" + jpo(0, 64).jd() + "…]";
    }

    public int wqx() {
        return this.f18565cm.length;
    }

    public String jpo() {
        String str = this.f18566jj;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f18565cm, f18564jd);
        this.f18566jj = str2;
        return str2;
    }

    public cm jpo(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.f18565cm;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException(b.f(this.f18565cm.length, ")", new StringBuilder("endIndex > length(")));
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new cm(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte jpo(int i10) {
        return this.f18565cm[i10];
    }

    public boolean jpo(int i10, cm cmVar, int i11, int i12) {
        return cmVar.jpo(i11, this.f18565cm, i10, i12);
    }

    public boolean jpo(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f18565cm;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && zz.jpo(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public int compareTo(cm cmVar) {
        int iWqx = wqx();
        int iWqx2 = cmVar.wqx();
        int iMin = Math.min(iWqx, iWqx2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iJpo = jpo(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int iJpo2 = cmVar.jpo(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (iJpo != iJpo2) {
                return iJpo < iJpo2 ? -1 : 1;
            }
        }
        if (iWqx == iWqx2) {
            return 0;
        }
        return iWqx < iWqx2 ? -1 : 1;
    }

    public static int jpo(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
