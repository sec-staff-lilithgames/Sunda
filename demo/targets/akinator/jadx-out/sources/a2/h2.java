package a2;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 extends b {

    /* renamed from: j, reason: collision with root package name */
    public final p0.j2 f3611j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3612k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h2(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    @Override // a2.b
    public void Content(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(420213850);
        kv.p pVar = (kv.p) this.f3611j.getValue();
        if (pVar != null) {
            pVar.invoke(wVarStartRestartGroup, 0);
        }
        p0.o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new g2(this, i10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = h2.class.getName();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "javaClass.name");
        return name;
    }

    @Override // a2.b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f3612k;
    }

    public final void setContent(kv.p content) {
        kotlin.jvm.internal.e0.checkNotNullParameter(content, "content");
        this.f3612k = true;
        this.f3611j.setValue(content);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ h2(Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f3611j = p0.o5.mutableStateOf$default(null, null, 2, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
