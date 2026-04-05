package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final g2.b f73888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73889b;

    public a(g2.b annotatedString, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(annotatedString, "annotatedString");
        this.f73888a = annotatedString;
        this.f73889b = i10;
    }

    @Override // m2.d
    public void applyTo(g buffer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasComposition$ui_text_release()) {
            buffer.replace$ui_text_release(buffer.getCompositionStart$ui_text_release(), buffer.getCompositionEnd$ui_text_release(), getText());
        } else {
            buffer.replace$ui_text_release(buffer.getSelectionStart$ui_text_release(), buffer.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = buffer.getCursor$ui_text_release();
        int i10 = this.f73889b;
        buffer.setCursor$ui_text_release(qv.v.coerceIn(i10 > 0 ? (cursor$ui_text_release + i10) - 1 : (cursor$ui_text_release + i10) - getText().length(), 0, buffer.getLength$ui_text_release()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.e0.areEqual(getText(), aVar.getText()) && this.f73889b == aVar.f73889b;
    }

    public final g2.b getAnnotatedString() {
        return this.f73888a;
    }

    public final int getNewCursorPosition() {
        return this.f73889b;
    }

    public final String getText() {
        return this.f73888a.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.f73889b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(getText());
        sb2.append("', newCursorPosition=");
        return e3.g.m(sb2, this.f73889b, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String text, int i10) {
        this(new g2.b(text, null, null, 6, null), i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
    }
}
