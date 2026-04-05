package q;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f3 extends f4.f implements View.OnClickListener {
    public int A;
    public int B;

    /* renamed from: o, reason: collision with root package name */
    public final SearchView f82088o;

    /* renamed from: p, reason: collision with root package name */
    public final SearchableInfo f82089p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f82090q;

    /* renamed from: r, reason: collision with root package name */
    public final WeakHashMap f82091r;

    /* renamed from: s, reason: collision with root package name */
    public final int f82092s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f82093t;

    /* renamed from: u, reason: collision with root package name */
    public int f82094u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f82095v;

    /* renamed from: w, reason: collision with root package name */
    public int f82096w;

    /* renamed from: x, reason: collision with root package name */
    public int f82097x;

    /* renamed from: y, reason: collision with root package name */
    public int f82098y;

    /* renamed from: z, reason: collision with root package name */
    public int f82099z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f82100a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f82101b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f82102c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f82103d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f82104e;

        public a(View view) {
            this.f82100a = (TextView) view.findViewById(R.id.text1);
            this.f82101b = (TextView) view.findViewById(R.id.text2);
            this.f82102c = (ImageView) view.findViewById(R.id.icon1);
            this.f82103d = (ImageView) view.findViewById(R.id.icon2);
            this.f82104e = (ImageView) view.findViewById(com.digidust.elokence.akinator.freemium.R.id.edit_query);
        }
    }

    public f3(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f82093t = false;
        this.f82094u = 1;
        this.f82096w = -1;
        this.f82097x = -1;
        this.f82098y = -1;
        this.f82099z = -1;
        this.A = -1;
        this.B = -1;
        this.f82088o = searchView;
        this.f82089p = searchableInfo;
        this.f82092s = searchView.getSuggestionCommitIconResId();
        this.f82090q = context;
        this.f82091r = weakHashMap;
    }

    public static String e(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    public static String getColumnString(Cursor cursor, String str) {
        return e(cursor, cursor.getColumnIndex(str));
    }

    public final Drawable b(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(p0.o2.p("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f82090q.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(p0.o2.p("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(p0.o2.p("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(p0.o2.p("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(p0.o2.p("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(p0.o2.p("No package found for authority: ", uri));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // f4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bindView(android.view.View r21, android.content.Context r22, android.database.Cursor r23) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f3.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable c(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f3.c(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // f4.c, f4.d
    public void changeCursor(Cursor cursor) {
        if (this.f82093t) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f82096w = cursor.getColumnIndex("suggest_text_1");
                this.f82097x = cursor.getColumnIndex("suggest_text_2");
                this.f82098y = cursor.getColumnIndex("suggest_text_2_url");
                this.f82099z = cursor.getColumnIndex("suggest_icon_1");
                this.A = cursor.getColumnIndex("suggest_icon_2");
                this.B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    public void close() {
        changeCursor(null);
        this.f82093t = true;
    }

    @Override // f4.c, f4.d
    public CharSequence convertToString(Cursor cursor) {
        String columnString;
        String columnString2;
        if (cursor == null) {
            return null;
        }
        String columnString3 = getColumnString(cursor, "suggest_intent_query");
        if (columnString3 != null) {
            return columnString3;
        }
        SearchableInfo searchableInfo = this.f82089p;
        if (searchableInfo.shouldRewriteQueryFromData() && (columnString2 = getColumnString(cursor, "suggest_intent_data")) != null) {
            return columnString2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (columnString = getColumnString(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return columnString;
    }

    public final Cursor d(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f82090q.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // f4.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewNewDropDownView = newDropDownView(this.f82090q, getCursor(), viewGroup);
            if (viewNewDropDownView != null) {
                ((a) viewNewDropDownView.getTag()).f82100a.setText(e10.toString());
            }
            return viewNewDropDownView;
        }
    }

    public int getQueryRefinement() {
        return this.f82094u;
    }

    @Override // f4.c, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewNewView = newView(this.f82090q, getCursor(), viewGroup);
            if (viewNewView != null) {
                ((a) viewNewView.getTag()).f82100a.setText(e10.toString());
            }
            return viewNewView;
        }
    }

    @Override // f4.c, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // f4.f, f4.c
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewNewView = super.newView(context, cursor, viewGroup);
        viewNewView.setTag(new a(viewNewView));
        ((ImageView) viewNewView.findViewById(com.digidust.elokence.akinator.freemium.R.id.edit_query)).setImageResource(this.f82092s);
        return viewNewView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = getCursor();
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = getCursor();
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f82088o.g((CharSequence) tag);
        }
    }

    @Override // f4.c, f4.d
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.f82088o;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                Cursor cursorD = d(this.f82089p, string);
                if (cursorD != null) {
                    cursorD.getCount();
                    return cursorD;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    public void setQueryRefinement(int i10) {
        this.f82094u = i10;
    }
}
