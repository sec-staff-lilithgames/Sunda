package mh;

import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n2 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CharSequence f74660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f74661c;

    public n2(r2 r2Var, CharSequence charSequence) {
        this.f74660b = charSequence;
        this.f74661c = r2Var;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        CharSequence charSequence = this.f74660b;
        r2 r2Var = this.f74661c;
        return r2Var.f74684c.iterator(r2Var, charSequence);
    }

    public String toString() {
        d1 d1VarOn = d1.on(", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        StringBuilder sbAppendTo = d1VarOn.appendTo(sb2, (Iterable<?>) this);
        sbAppendTo.append(AbstractJsonLexerKt.END_LIST);
        return sbAppendTo.toString();
    }
}
