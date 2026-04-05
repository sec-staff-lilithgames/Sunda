package y9;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final Context f94211b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f94212c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f94213e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f94214f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f94215g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f94216h;

    /* renamed from: i, reason: collision with root package name */
    public final int f94217i;

    /* renamed from: j, reason: collision with root package name */
    public final int f94218j;

    /* renamed from: k, reason: collision with root package name */
    public final int f94219k;

    /* renamed from: l, reason: collision with root package name */
    public final int f94220l;

    /* renamed from: m, reason: collision with root package name */
    public final Typeface f94221m;

    /* renamed from: n, reason: collision with root package name */
    public final LayoutInflater f94222n;

    /* renamed from: o, reason: collision with root package name */
    public final int f94223o;

    /* renamed from: p, reason: collision with root package name */
    public final int f94224p;

    /* renamed from: q, reason: collision with root package name */
    public final int f94225q;

    /* renamed from: r, reason: collision with root package name */
    public final int f94226r;

    /* renamed from: s, reason: collision with root package name */
    public final int f94227s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f94228a;

        /* renamed from: b, reason: collision with root package name */
        public v f94229b;

        public a(int i10, v perso) {
            e0.checkNotNullParameter(perso, "perso");
            this.f94228a = i10;
            this.f94229b = perso;
        }

        public final int getBadge() {
            return this.f94228a;
        }

        public final v getPerso() {
            return this.f94229b;
        }

        public final void setBadge(int i10) {
            this.f94228a = i10;
        }

        public final void setPerso(v vVar) {
            e0.checkNotNullParameter(vVar, "<set-?>");
            this.f94229b = vVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f94230a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f94231b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f94232c;

        /* renamed from: d, reason: collision with root package name */
        public View f94233d;

        public final ImageView getImageBadge() {
            return this.f94230a;
        }

        public final View getLine() {
            return this.f94233d;
        }

        public final TextView getTextCharacterPlayedDesc() {
            return this.f94232c;
        }

        public final TextView getTextCharacterPlayedName() {
            return this.f94231b;
        }

        public final void setImageBadge(ImageView imageView) {
            this.f94230a = imageView;
        }

        public final void setLine(View view) {
            this.f94233d = view;
        }

        public final void setTextCharacterPlayedDesc(TextView textView) {
            this.f94232c = textView;
        }

        public final void setTextCharacterPlayedName(TextView textView) {
            this.f94231b = textView;
        }
    }

    public k(Context mContext, ArrayList<v> arrayList, ArrayList<v> arrayList2, ArrayList<v> arrayList3, ArrayList<v> arrayList4, ArrayList<v> arrayList5) {
        e0.checkNotNullParameter(mContext, "mContext");
        this.f94211b = mContext;
        this.f94212c = arrayList;
        this.f94213e = arrayList2;
        this.f94214f = arrayList3;
        this.f94215g = arrayList4;
        this.f94216h = arrayList5;
        this.f94221m = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(mContext);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94222n = layoutInflaterFrom;
        if (arrayList != null) {
            this.f94223o = arrayList.size();
        }
        if (arrayList2 != null) {
            this.f94224p = arrayList2.size();
        }
        if (arrayList3 != null) {
            this.f94225q = arrayList3.size();
        }
        if (arrayList4 != null) {
            this.f94226r = arrayList4.size();
        }
        if (arrayList5 != null) {
            this.f94227s = arrayList5.size();
        }
        int i10 = this.f94223o;
        this.f94217i = i10;
        int i11 = i10 + this.f94224p;
        this.f94218j = i11;
        int i12 = i11 + this.f94225q;
        this.f94219k = i12;
        this.f94220l = i12 + this.f94226r;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94223o + this.f94224p + this.f94225q + this.f94226r + this.f94227s;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        int i11 = this.f94217i;
        if (i10 >= 0 && i10 < i11) {
            ArrayList arrayList = this.f94212c;
            e0.checkNotNull(arrayList);
            Object obj = arrayList.get(i10);
            e0.checkNotNullExpressionValue(obj, "get(...)");
            return new a(5, (v) obj);
        }
        int i12 = this.f94218j;
        if (i10 >= i11 && i10 < i12) {
            ArrayList arrayList2 = this.f94213e;
            e0.checkNotNull(arrayList2);
            Object obj2 = arrayList2.get(i10 - i11);
            e0.checkNotNullExpressionValue(obj2, "get(...)");
            return new a(4, (v) obj2);
        }
        int i13 = this.f94219k;
        if (i10 >= i12 && i10 < i13) {
            ArrayList arrayList3 = this.f94214f;
            e0.checkNotNull(arrayList3);
            Object obj3 = arrayList3.get(i10 - i12);
            e0.checkNotNullExpressionValue(obj3, "get(...)");
            return new a(3, (v) obj3);
        }
        int i14 = this.f94220l;
        if (i10 >= i13 && i10 < i14) {
            ArrayList arrayList4 = this.f94215g;
            e0.checkNotNull(arrayList4);
            Object obj4 = arrayList4.get(i10 - i13);
            e0.checkNotNullExpressionValue(obj4, "get(...)");
            return new a(2, (v) obj4);
        }
        if (i10 < i14) {
            return null;
        }
        ArrayList arrayList5 = this.f94216h;
        e0.checkNotNull(arrayList5);
        Object obj5 = arrayList5.get(i10 - i14);
        e0.checkNotNullExpressionValue(obj5, "get(...)");
        return new a(1, (v) obj5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        if (view == null) {
            bVar = new b();
            viewInflate = this.f94222n.inflate(R.layout.item_character_played_full, (ViewGroup) null);
            bVar.setImageBadge((ImageView) viewInflate.findViewById(R.id.imageBadge));
            bVar.setTextCharacterPlayedName((TextView) viewInflate.findViewById(R.id.characterPlayedName));
            bVar.setTextCharacterPlayedDesc((TextView) viewInflate.findViewById(R.id.characterPlayedDesc));
            bVar.setLine(viewInflate.findViewById(R.id.line));
            TextView textCharacterPlayedName = bVar.getTextCharacterPlayedName();
            e0.checkNotNull(textCharacterPlayedName);
            Typeface typeface = this.f94221m;
            textCharacterPlayedName.setTypeface(typeface);
            TextView textCharacterPlayedDesc = bVar.getTextCharacterPlayedDesc();
            e0.checkNotNull(textCharacterPlayedDesc);
            textCharacterPlayedDesc.setTypeface(typeface);
            viewInflate.setTag(bVar);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.ListAwardsOnePlayerAdapter.ViewHolder");
            b bVar2 = (b) tag;
            viewInflate = view;
            bVar = bVar2;
        }
        Object item = getItem(i10);
        if (item == null) {
            TextView textCharacterPlayedName2 = bVar.getTextCharacterPlayedName();
            e0.checkNotNull(textCharacterPlayedName2);
            textCharacterPlayedName2.setVisibility(8);
            TextView textCharacterPlayedDesc2 = bVar.getTextCharacterPlayedDesc();
            e0.checkNotNull(textCharacterPlayedDesc2);
            textCharacterPlayedDesc2.setVisibility(8);
            ImageView imageBadge = bVar.getImageBadge();
            e0.checkNotNull(imageBadge);
            imageBadge.setVisibility(8);
            View line = bVar.getLine();
            e0.checkNotNull(line);
            line.setVisibility(8);
        } else {
            a aVar = (a) item;
            int badge = aVar.getBadge();
            Context context = this.f94211b;
            if (badge == 1) {
                ImageView imageBadge2 = bVar.getImageBadge();
                e0.checkNotNull(imageBadge2);
                imageBadge2.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_bronze));
            } else if (badge == 2) {
                ImageView imageBadge3 = bVar.getImageBadge();
                e0.checkNotNull(imageBadge3);
                imageBadge3.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_silver));
            } else if (badge == 3) {
                ImageView imageBadge4 = bVar.getImageBadge();
                e0.checkNotNull(imageBadge4);
                imageBadge4.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_gold));
            } else if (badge == 4) {
                ImageView imageBadge5 = bVar.getImageBadge();
                e0.checkNotNull(imageBadge5);
                imageBadge5.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_platinum));
            } else if (badge == 5) {
                ImageView imageBadge6 = bVar.getImageBadge();
                e0.checkNotNull(imageBadge6);
                imageBadge6.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_black));
            }
            TextView textCharacterPlayedName3 = bVar.getTextCharacterPlayedName();
            e0.checkNotNull(textCharacterPlayedName3);
            textCharacterPlayedName3.setText((CharSequence) aVar.getPerso().getFirst());
            TextView textCharacterPlayedDesc3 = bVar.getTextCharacterPlayedDesc();
            e0.checkNotNull(textCharacterPlayedDesc3);
            textCharacterPlayedDesc3.setText("(" + aVar.getPerso().getSecond() + ")");
            View line2 = bVar.getLine();
            e0.checkNotNull(line2);
            line2.setVisibility(0);
        }
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return false;
    }
}
