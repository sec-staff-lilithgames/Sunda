package ph;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Appendable {

    /* renamed from: b, reason: collision with root package name */
    public int f81291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81292c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Appendable f81293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f81294f;

    public e(int i10, Appendable appendable, String str) {
        this.f81292c = i10;
        this.f81293e = appendable;
        this.f81294f = str;
        this.f81291b = i10;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c10) throws IOException {
        int i10 = this.f81291b;
        Appendable appendable = this.f81293e;
        if (i10 == 0) {
            appendable.append(this.f81294f);
            this.f81291b = this.f81292c;
        }
        appendable.append(c10);
        this.f81291b--;
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }
}
