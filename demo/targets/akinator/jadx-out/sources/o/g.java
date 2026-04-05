package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p.d0;
import p.v;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f77235a;

    /* renamed from: b, reason: collision with root package name */
    public final c f77236b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f77237a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f77238b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f77239c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final t1 f77240d = new t1();

        public a(Context context, ActionMode.Callback callback) {
            this.f77238b = context;
            this.f77237a = callback;
        }

        public ActionMode getActionModeWrapper(c cVar) {
            ArrayList arrayList = this.f77239c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = (g) arrayList.get(i10);
                if (gVar != null && gVar.f77236b == cVar) {
                    return gVar;
                }
            }
            g gVar2 = new g(this.f77238b, cVar);
            arrayList.add(gVar2);
            return gVar2;
        }

        @Override // o.b
        public boolean onActionItemClicked(c cVar, MenuItem menuItem) {
            return this.f77237a.onActionItemClicked(getActionModeWrapper(cVar), new v(this.f77238b, (q3.b) menuItem));
        }

        @Override // o.b
        public boolean onCreateActionMode(c cVar, Menu menu) {
            ActionMode actionModeWrapper = getActionModeWrapper(cVar);
            t1 t1Var = this.f77240d;
            Menu d0Var = (Menu) t1Var.get(menu);
            if (d0Var == null) {
                d0Var = new d0(this.f77238b, (q3.a) menu);
                t1Var.put(menu, d0Var);
            }
            return this.f77237a.onCreateActionMode(actionModeWrapper, d0Var);
        }

        @Override // o.b
        public void onDestroyActionMode(c cVar) {
            this.f77237a.onDestroyActionMode(getActionModeWrapper(cVar));
        }

        @Override // o.b
        public boolean onPrepareActionMode(c cVar, Menu menu) {
            ActionMode actionModeWrapper = getActionModeWrapper(cVar);
            t1 t1Var = this.f77240d;
            Menu d0Var = (Menu) t1Var.get(menu);
            if (d0Var == null) {
                d0Var = new d0(this.f77238b, (q3.a) menu);
                t1Var.put(menu, d0Var);
            }
            return this.f77237a.onPrepareActionMode(actionModeWrapper, d0Var);
        }
    }

    public g(Context context, c cVar) {
        this.f77235a = context;
        this.f77236b = cVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f77236b.finish();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f77236b.getCustomView();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new d0(this.f77235a, (q3.a) this.f77236b.getMenu());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f77236b.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f77236b.getSubtitle();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f77236b.getTag();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f77236b.getTitle();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f77236b.getTitleOptionalHint();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f77236b.invalidate();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f77236b.isTitleOptional();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f77236b.setCustomView(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f77236b.setSubtitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f77236b.setTag(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f77236b.setTitle(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f77236b.setTitleOptionalHint(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f77236b.setSubtitle(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f77236b.setTitle(i10);
    }
}
