package f4;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable, d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f55342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f55343c;

    /* renamed from: e, reason: collision with root package name */
    public Cursor f55344e;

    /* renamed from: f, reason: collision with root package name */
    public Context f55345f;

    /* renamed from: g, reason: collision with root package name */
    public int f55346g;

    /* renamed from: h, reason: collision with root package name */
    public a f55347h;

    /* renamed from: i, reason: collision with root package name */
    public b f55348i;

    /* renamed from: j, reason: collision with root package name */
    public e f55349j;

    /* renamed from: k, reason: collision with root package name */
    public FilterQueryProvider f55350k;

    @Deprecated
    public c(Context context, Cursor cursor) {
        a(context, cursor, 1);
    }

    public final void a(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f55343c = true;
        } else {
            this.f55343c = false;
        }
        boolean z10 = cursor != null;
        this.f55344e = cursor;
        this.f55342b = z10;
        this.f55345f = context;
        this.f55346g = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f55347h = new a(this);
            this.f55348i = new b(this);
        } else {
            this.f55347h = null;
            this.f55348i = null;
        }
        if (z10) {
            a aVar = this.f55347h;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            b bVar = this.f55348i;
            if (bVar != null) {
                cursor.registerDataSetObserver(bVar);
            }
        }
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    @Override // f4.d
    public void changeCursor(Cursor cursor) {
        Cursor cursorSwapCursor = swapCursor(cursor);
        if (cursorSwapCursor != null) {
            cursorSwapCursor.close();
        }
    }

    @Override // f4.d
    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f55342b || (cursor = this.f55344e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // f4.d
    public Cursor getCursor() {
        return this.f55344e;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f55342b) {
            return null;
        }
        this.f55344e.moveToPosition(i10);
        if (view == null) {
            view = newDropDownView(this.f55345f, this.f55344e, viewGroup);
        }
        bindView(view, this.f55345f, this.f55344e);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f55349j == null) {
            e eVar = new e();
            eVar.f55351a = this;
            this.f55349j = eVar;
        }
        return this.f55349j;
    }

    public FilterQueryProvider getFilterQueryProvider() {
        return this.f55350k;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f55342b || (cursor = this.f55344e) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f55344e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f55342b && (cursor = this.f55344e) != null && cursor.moveToPosition(i10)) {
            return this.f55344e.getLong(this.f55346g);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f55342b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f55344e.moveToPosition(i10)) {
            throw new IllegalStateException(a.b.e(i10, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = newView(this.f55345f, this.f55344e, viewGroup);
        }
        bindView(view, this.f55345f, this.f55344e);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // f4.d
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f55350k;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f55344e;
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
        this.f55350k = filterQueryProvider;
    }

    public Cursor swapCursor(Cursor cursor) {
        Cursor cursor2 = this.f55344e;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f55347h;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            b bVar = this.f55348i;
            if (bVar != null) {
                cursor2.unregisterDataSetObserver(bVar);
            }
        }
        this.f55344e = cursor;
        if (cursor == null) {
            this.f55346g = -1;
            this.f55342b = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        a aVar2 = this.f55347h;
        if (aVar2 != null) {
            cursor.registerContentObserver(aVar2);
        }
        b bVar2 = this.f55348i;
        if (bVar2 != null) {
            cursor.registerDataSetObserver(bVar2);
        }
        this.f55346g = cursor.getColumnIndexOrThrow("_id");
        this.f55342b = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public c(Context context, Cursor cursor, boolean z10) {
        a(context, cursor, z10 ? 1 : 2);
    }

    public c(Context context, Cursor cursor, int i10) {
        a(context, cursor, i10);
    }
}
