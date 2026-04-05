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

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final Context f94243b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f94244c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f94245e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f94246f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f94247a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f94248b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f94249c;

        /* renamed from: d, reason: collision with root package name */
        public View f94250d;

        public final ImageView getImageBadge() {
            return this.f94247a;
        }

        public final View getLine() {
            return this.f94250d;
        }

        public final TextView getTextCharacterPlayedDesc() {
            return this.f94249c;
        }

        public final TextView getTextCharacterPlayedName() {
            return this.f94248b;
        }

        public final void setImageBadge(ImageView imageView) {
            this.f94247a = imageView;
        }

        public final void setLine(View view) {
            this.f94250d = view;
        }

        public final void setTextCharacterPlayedDesc(TextView textView) {
            this.f94249c = textView;
        }

        public final void setTextCharacterPlayedName(TextView textView) {
            this.f94248b = textView;
        }
    }

    public m(Context mContext, ArrayList<ta.e> mFakeAwards) {
        e0.checkNotNullParameter(mContext, "mContext");
        e0.checkNotNullParameter(mFakeAwards, "mFakeAwards");
        this.f94243b = mContext;
        this.f94244c = mFakeAwards;
        this.f94245e = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(mContext);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94246f = layoutInflaterFrom;
    }

    public final void clear() {
        this.f94244c.clear();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94244c.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View viewInflate;
        a aVar;
        if (view == null) {
            aVar = new a();
            viewInflate = this.f94246f.inflate(R.layout.item_character_played_full, (ViewGroup) null);
            aVar.setImageBadge((ImageView) viewInflate.findViewById(R.id.imageBadge));
            aVar.setTextCharacterPlayedName((TextView) viewInflate.findViewById(R.id.characterPlayedName));
            aVar.setTextCharacterPlayedDesc((TextView) viewInflate.findViewById(R.id.characterPlayedDesc));
            aVar.setLine(viewInflate.findViewById(R.id.line));
            TextView textCharacterPlayedName = aVar.getTextCharacterPlayedName();
            e0.checkNotNull(textCharacterPlayedName);
            Typeface typeface = this.f94245e;
            textCharacterPlayedName.setTypeface(typeface);
            TextView textCharacterPlayedDesc = aVar.getTextCharacterPlayedDesc();
            e0.checkNotNull(textCharacterPlayedDesc);
            textCharacterPlayedDesc.setTypeface(typeface);
            viewInflate.setTag(aVar);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.ListMyFakeAdapter.ViewHolder");
            a aVar2 = (a) tag;
            viewInflate = view;
            aVar = aVar2;
        }
        ta.e item = getItem(i10);
        e0.checkNotNull(item);
        int fakeAwardIndex = item.getFakeAwardIndex();
        Context context = this.f94243b;
        if (fakeAwardIndex == 1) {
            ImageView imageBadge = aVar.getImageBadge();
            e0.checkNotNull(imageBadge);
            imageBadge.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_bronze));
        } else if (fakeAwardIndex == 2) {
            ImageView imageBadge2 = aVar.getImageBadge();
            e0.checkNotNull(imageBadge2);
            imageBadge2.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_silver));
        } else if (fakeAwardIndex == 3) {
            ImageView imageBadge3 = aVar.getImageBadge();
            e0.checkNotNull(imageBadge3);
            imageBadge3.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_gold));
        } else if (fakeAwardIndex == 4) {
            ImageView imageBadge4 = aVar.getImageBadge();
            e0.checkNotNull(imageBadge4);
            imageBadge4.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_platinum));
        } else if (fakeAwardIndex == 5) {
            ImageView imageBadge5 = aVar.getImageBadge();
            e0.checkNotNull(imageBadge5);
            imageBadge5.setImageDrawable(m3.a.getDrawable(context, R.drawable.mini_badge_black));
        }
        TextView textCharacterPlayedName2 = aVar.getTextCharacterPlayedName();
        e0.checkNotNull(textCharacterPlayedName2);
        ArrayList arrayList = this.f94244c;
        textCharacterPlayedName2.setText(((ta.e) arrayList.get(i10)).getFakeNom());
        TextView textCharacterPlayedDesc2 = aVar.getTextCharacterPlayedDesc();
        e0.checkNotNull(textCharacterPlayedDesc2);
        textCharacterPlayedDesc2.setText(((ta.e) arrayList.get(i10)).getFakeDescription());
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return false;
    }

    @Override // android.widget.Adapter
    public ta.e getItem(int i10) {
        return (ta.e) this.f94244c.get(i10);
    }
}
