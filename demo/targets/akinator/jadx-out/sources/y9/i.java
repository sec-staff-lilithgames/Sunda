package y9;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final Context f94199b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f94200c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f94201e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f94202f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public TextView f94203a;

        /* renamed from: b, reason: collision with root package name */
        public LinearLayout f94204b;

        public final TextView getPodiumDate() {
            return this.f94203a;
        }

        public final LinearLayout getPodiumJoueur() {
            return this.f94204b;
        }

        public final void setPodiumDate(TextView textView) {
            this.f94203a = textView;
        }

        public final void setPodiumJoueur(LinearLayout linearLayout) {
            this.f94204b = linearLayout;
        }
    }

    public i(Context context, ArrayList<Pair<String, ArrayList<ta.f>>> mHistoPodiums) {
        e0.checkNotNullParameter(mHistoPodiums, "mHistoPodiums");
        this.f94199b = context;
        this.f94200c = mHistoPodiums;
        this.f94201e = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94202f = layoutInflaterFrom;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94200c.size() * 4;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        int i11 = i10 % 4;
        ArrayList arrayList = this.f94200c;
        if (i11 == 0) {
            Object obj = arrayList.get(i10 / 4);
            e0.checkNotNull(obj);
            return (Serializable) ((Pair) obj).first;
        }
        Object obj2 = arrayList.get(i10 / 4);
        e0.checkNotNull(obj2);
        Object obj3 = ((Pair) obj2).second;
        e0.checkNotNull(obj3);
        return (Serializable) ((ArrayList) obj3).get(i11 - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        View viewInflate;
        Typeface typeface = this.f94201e;
        if (view == null) {
            aVar = new a();
            viewInflate = this.f94202f.inflate(R.layout.item_historique_podiums, (ViewGroup) null);
            aVar.setPodiumDate((TextView) viewInflate.findViewById(R.id.podiumDate));
            aVar.setPodiumJoueur((LinearLayout) viewInflate.findViewById(R.id.podiumJoueur));
            TextView podiumDate = aVar.getPodiumDate();
            e0.checkNotNull(podiumDate);
            podiumDate.setTypeface(typeface);
            viewInflate.setTag(aVar);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.HistoriquePodiumsAdapter.ViewHolder");
            aVar = (a) tag;
            viewInflate = view;
        }
        Object item = getItem(i10);
        if (i10 % 4 == 0) {
            TextView podiumDate2 = aVar.getPodiumDate();
            e0.checkNotNull(podiumDate2);
            podiumDate2.setVisibility(0);
            LinearLayout podiumJoueur = aVar.getPodiumJoueur();
            e0.checkNotNull(podiumJoueur);
            podiumJoueur.setVisibility(8);
            TextView podiumDate3 = aVar.getPodiumDate();
            e0.checkNotNull(podiumDate3);
            podiumDate3.setText((String) item);
        } else {
            TextView podiumDate4 = aVar.getPodiumDate();
            e0.checkNotNull(podiumDate4);
            podiumDate4.setVisibility(8);
            LinearLayout podiumJoueur2 = aVar.getPodiumJoueur();
            e0.checkNotNull(podiumJoueur2);
            podiumJoueur2.setVisibility(0);
            ta.f fVar = (ta.f) item;
            LinearLayout podiumJoueur3 = aVar.getPodiumJoueur();
            e0.checkNotNull(podiumJoueur3);
            if (fVar != null) {
                TextView textView = (TextView) podiumJoueur3.findViewById(R.id.classementRang);
                textView.setText(String.valueOf(fVar.getRang()));
                textView.setTypeface(typeface);
                textView.setTextColor(-16777216);
                ImageView imageView = (ImageView) podiumJoueur3.findViewById(R.id.classementRangImage);
                if (fVar.getRang() == 1) {
                    imageView.setBackgroundResource(R.drawable.mini_gold_medal);
                } else if (fVar.getRang() == 2) {
                    imageView.setBackgroundResource(R.drawable.mini_silver_medal);
                } else if (fVar.getRang() == 3) {
                    imageView.setBackgroundResource(R.drawable.mini_bronze_medal);
                    textView.setTextColor(-1);
                }
                ((TextView) podiumJoueur3.findViewById(R.id.classementMedaille)).setVisibility(4);
                TextView textView2 = (TextView) podiumJoueur3.findViewById(R.id.classementNom);
                textView2.setText(fVar.getNom());
                textView2.setTypeface(typeface);
                TextView textView3 = (TextView) podiumJoueur3.findViewById(R.id.classementScore);
                textView3.setText(String.valueOf(fVar.getScore()));
                textView3.setTypeface(typeface);
                TextView textView4 = (TextView) podiumJoueur3.findViewById(R.id.classementBadgeBlack);
                TextView textView5 = (TextView) podiumJoueur3.findViewById(R.id.classementBadgePlatinum);
                TextView textView6 = (TextView) podiumJoueur3.findViewById(R.id.classementBadgeGold);
                TextView textView7 = (TextView) podiumJoueur3.findViewById(R.id.classementBadgeSilver);
                TextView textView8 = (TextView) podiumJoueur3.findViewById(R.id.classementBadgeBronze);
                TextView textView9 = (TextView) podiumJoueur3.findViewById(R.id.classementBadgeDdj);
                textView4.setText(String.valueOf(fVar.getNbBadges(5)));
                textView5.setText(String.valueOf(fVar.getNbBadges(4)));
                textView6.setText(String.valueOf(fVar.getNbBadges(3)));
                textView7.setText(String.valueOf(fVar.getNbBadges(2)));
                textView8.setText(String.valueOf(fVar.getNbBadges(1)));
                textView9.setText(String.valueOf(fVar.getNbDDJ()));
                textView4.setTypeface(typeface);
                textView5.setTypeface(typeface);
                textView6.setTypeface(typeface);
                textView7.setTypeface(typeface);
                textView8.setTypeface(typeface);
                textView9.setTypeface(typeface);
                if (fVar.getNbDDJ() == 5) {
                    textView9.setBackgroundResource(R.drawable.mini_badge_ddj_full);
                } else {
                    textView9.setBackgroundResource(R.drawable.mini_badge_ddj);
                }
            }
        }
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return false;
    }
}
