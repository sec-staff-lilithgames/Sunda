package a2;

import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 implements u4 {

    /* renamed from: a, reason: collision with root package name */
    public final View f3700a;

    /* renamed from: b, reason: collision with root package name */
    public ActionMode f3701b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.d f3702c;

    /* renamed from: d, reason: collision with root package name */
    public w4 f3703d;

    public l1(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f3700a = view;
        this.f3702c = new c2.d(new k1(this), null, null, null, null, null, 62, null);
        this.f3703d = w4.f3876c;
    }

    @Override // a2.u4
    public w4 getStatus() {
        return this.f3703d;
    }

    @Override // a2.u4
    public void hide() {
        this.f3703d = w4.f3876c;
        ActionMode actionMode = this.f3701b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f3701b = null;
    }

    @Override // a2.u4
    public void showMenu(i1.j rect, kv.a aVar, kv.a aVar2, kv.a aVar3, kv.a aVar4) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        c2.d dVar = this.f3702c;
        dVar.setRect(rect);
        dVar.setOnCopyRequested(aVar);
        dVar.setOnCutRequested(aVar3);
        dVar.setOnPasteRequested(aVar2);
        dVar.setOnSelectAllRequested(aVar4);
        ActionMode actionMode = this.f3701b;
        if (actionMode == null) {
            this.f3703d = w4.f3875b;
            this.f3701b = v4.f3866a.startActionMode(this.f3700a, new c2.a(dVar), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
