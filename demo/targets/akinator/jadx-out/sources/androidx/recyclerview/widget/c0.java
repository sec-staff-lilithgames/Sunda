package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView.n f7077a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView.n f7078b;

    /* renamed from: c, reason: collision with root package name */
    public int f7079c;

    /* renamed from: d, reason: collision with root package name */
    public int f7080d;

    /* renamed from: e, reason: collision with root package name */
    public int f7081e;

    /* renamed from: f, reason: collision with root package name */
    public int f7082f;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
        sb2.append(this.f7077a);
        sb2.append(", newHolder=");
        sb2.append(this.f7078b);
        sb2.append(", fromX=");
        sb2.append(this.f7079c);
        sb2.append(", fromY=");
        sb2.append(this.f7080d);
        sb2.append(", toX=");
        sb2.append(this.f7081e);
        sb2.append(", toY=");
        return e3.g.m(sb2, this.f7082f, AbstractJsonLexerKt.END_OBJ);
    }
}
