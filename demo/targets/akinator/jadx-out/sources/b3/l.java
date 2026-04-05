package b3;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l extends c {

    /* renamed from: h, reason: collision with root package name */
    public int f8741h;

    /* renamed from: i, reason: collision with root package name */
    public k f8742i;

    /* renamed from: j, reason: collision with root package name */
    public final char[] f8743j;

    /* renamed from: k, reason: collision with root package name */
    public final char[] f8744k;

    /* renamed from: l, reason: collision with root package name */
    public final char[] f8745l;

    public l(char[] cArr) {
        super(cArr);
        this.f8741h = 0;
        this.f8742i = k.f8736b;
        this.f8743j = "true".toCharArray();
        this.f8744k = "false".toCharArray();
        this.f8745l = AbstractJsonLexerKt.NULL.toCharArray();
    }

    public static c allocate(char[] cArr) {
        return new l(cArr);
    }

    public boolean getBoolean() throws i {
        k kVar = this.f8742i;
        if (kVar == k.f8737c) {
            return true;
        }
        if (kVar == k.f8738e) {
            return false;
        }
        throw new i("this token is not a boolean: <" + content() + ">", this);
    }

    public k getType() {
        return this.f8742i;
    }

    public boolean isNull() throws i {
        if (this.f8742i == k.f8739f) {
            return true;
        }
        throw new i("this token is not a null: <" + content() + ">", this);
    }

    @Override // b3.c
    public final String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        c.a(i10, sb2);
        sb2.append(content());
        return sb2.toString();
    }

    @Override // b3.c
    public final String toJSON() {
        return content();
    }

    public boolean validate(char c10, long j10) {
        int iOrdinal = this.f8742i.ordinal();
        char[] cArr = this.f8743j;
        char[] cArr2 = this.f8744k;
        char[] cArr3 = this.f8745l;
        if (iOrdinal == 0) {
            int i10 = this.f8741h;
            if (cArr[i10] == c10) {
                this.f8742i = k.f8737c;
            } else if (cArr2[i10] == c10) {
                this.f8742i = k.f8738e;
            } else if (cArr3[i10] == c10) {
                this.f8742i = k.f8739f;
            }
            z = true;
        } else if (iOrdinal == 1) {
            int i11 = this.f8741h;
            z = cArr[i11] == c10;
            if (z && i11 + 1 == cArr.length) {
                setEnd(j10);
            }
        } else if (iOrdinal == 2) {
            int i12 = this.f8741h;
            z = cArr2[i12] == c10;
            if (z && i12 + 1 == cArr2.length) {
                setEnd(j10);
            }
        } else if (iOrdinal == 3) {
            int i13 = this.f8741h;
            z = cArr3[i13] == c10;
            if (z && i13 + 1 == cArr3.length) {
                setEnd(j10);
            }
        }
        this.f8741h++;
        return z;
    }
}
