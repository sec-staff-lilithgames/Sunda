package io.ktor.http;

import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class StringLexer {
    private int index;
    private final String source;

    public StringLexer(String source) {
        e0.checkNotNullParameter(source, "source");
        this.source = source;
    }

    public final boolean accept(l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        boolean zTest = test(predicate);
        if (zTest) {
            this.index++;
        }
        return zTest;
    }

    public final boolean acceptWhile(l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        if (!test(predicate)) {
            return false;
        }
        while (test(predicate)) {
            this.index++;
        }
        return true;
    }

    public final String capture(l block) {
        e0.checkNotNullParameter(block, "block");
        int index = getIndex();
        block.invoke(this);
        String strSubstring = getSource().substring(index, getIndex());
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean getHasRemaining() {
        return this.index < this.source.length();
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getSource() {
        return this.source;
    }

    public final void setIndex(int i10) {
        this.index = i10;
    }

    public final boolean test(l predicate) {
        e0.checkNotNullParameter(predicate, "predicate");
        return this.index < this.source.length() && ((Boolean) predicate.invoke(Character.valueOf(this.source.charAt(this.index)))).booleanValue();
    }
}
