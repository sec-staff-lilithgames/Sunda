package a2;

import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public static final v4 f3866a = new v4();

    public final void invalidateContentRect(ActionMode actionMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    public final ActionMode startActionMode(View view, ActionMode.Callback actionModeCallback, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(actionModeCallback, "actionModeCallback");
        return view.startActionMode(actionModeCallback, i10);
    }
}
