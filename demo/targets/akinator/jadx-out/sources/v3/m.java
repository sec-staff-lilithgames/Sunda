package v3;

import java.nio.CharBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final l f88974a;

    public m(l lVar) {
        this.f88974a = lVar;
    }

    public abstract boolean a();

    @Override // v3.j
    public boolean isRtl(char[] cArr, int i10, int i11) {
        return isRtl(CharBuffer.wrap(cArr), i10, i11);
    }

    @Override // v3.j
    public boolean isRtl(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
            throw new IllegalArgumentException();
        }
        l lVar = this.f88974a;
        if (lVar == null) {
            return a();
        }
        int iCheckRtl = lVar.checkRtl(charSequence, i10, i11);
        if (iCheckRtl == 0) {
            return true;
        }
        if (iCheckRtl != 1) {
            return a();
        }
        return false;
    }
}
