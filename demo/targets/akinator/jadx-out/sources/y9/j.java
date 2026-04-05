package y9;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import ta.k;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final Context f94205b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f94206c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f94207e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f94208f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public TextView f94209a;

        /* renamed from: b, reason: collision with root package name */
        public LinearLayout f94210b;

        public a(j jVar, View view) {
            this.f94209a = view != null ? (TextView) view.findViewById(R.id.podiumDate) : null;
            this.f94210b = view != null ? (LinearLayout) view.findViewById(R.id.podiumJoueur) : null;
        }

        public final TextView getPodiumDate$akinatorGL_gplayFreemiumRelease() {
            return this.f94209a;
        }

        public final LinearLayout getPodiumJoueur$akinatorGL_gplayFreemiumRelease() {
            return this.f94210b;
        }

        public final void setPodiumDate$akinatorGL_gplayFreemiumRelease(TextView textView) {
            this.f94209a = textView;
        }

        public final void setPodiumJoueur$akinatorGL_gplayFreemiumRelease(LinearLayout linearLayout) {
            this.f94210b = linearLayout;
        }
    }

    public j(Context mContext, k.c mLegends) {
        e0.checkNotNullParameter(mContext, "mContext");
        e0.checkNotNullParameter(mLegends, "mLegends");
        this.f94205b = mContext;
        this.f94206c = mLegends;
        this.f94207e = AkApplication.f21719f.getTypeFace();
        this.f94208f = LayoutInflater.from(mContext);
    }

    public static void a(TextView textView, int i10) {
        if (i10 < 0) {
            textView.setText("0");
            return;
        }
        if (i10 < 1000) {
            textView.setText(String.valueOf(i10));
            return;
        }
        if (1000 <= i10 && i10 < 2001) {
            textView.setText("1K");
            return;
        }
        if (2000 <= i10 && i10 < 3001) {
            textView.setText("2K");
            return;
        }
        if (3000 <= i10 && i10 < 4001) {
            textView.setText("3K");
            return;
        }
        if (4000 <= i10 && i10 < 5001) {
            textView.setText("4K");
            return;
        }
        if (5000 <= i10 && i10 < 6001) {
            textView.setText("5K");
            return;
        }
        if (6000 <= i10 && i10 < 7001) {
            textView.setText("6K");
            return;
        }
        if (7000 <= i10 && i10 < 8001) {
            textView.setText("7K");
            return;
        }
        if (8000 <= i10 && i10 < 9001) {
            textView.setText("8K");
        } else if (9000 > i10 || i10 >= 10001) {
            textView.setText("10K");
        } else {
            textView.setText("9K");
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<k.b> legends = this.f94206c.getLegends();
        e0.checkNotNull(legends);
        return legends.size();
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ Object getItem(int i10) {
        getItem(i10);
        return x0.f87415a;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup parent) {
        a aVar;
        e0.checkNotNullParameter(parent, "parent");
        if (view == null) {
            LayoutInflater layoutInflater = this.f94208f;
            e0.checkNotNull(layoutInflater);
            view = layoutInflater.inflate(R.layout.item_historique_podiums, (ViewGroup) null);
            aVar = new a(this, view);
            TextView podiumDate$akinatorGL_gplayFreemiumRelease = aVar.getPodiumDate$akinatorGL_gplayFreemiumRelease();
            if (podiumDate$akinatorGL_gplayFreemiumRelease != null) {
                podiumDate$akinatorGL_gplayFreemiumRelease.setVisibility(8);
            }
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.LegendesAdapter.ViewHolder");
            aVar = (a) tag;
        }
        LinearLayout podiumJoueur$akinatorGL_gplayFreemiumRelease = aVar.getPodiumJoueur$akinatorGL_gplayFreemiumRelease();
        ArrayList<k.b> legends = this.f94206c.getLegends();
        e0.checkNotNull(legends);
        k.b bVar = legends.get(i10);
        int i11 = i10 + 1;
        if (bVar != null) {
            e0.checkNotNull(podiumJoueur$akinatorGL_gplayFreemiumRelease);
            TextView textView = (TextView) podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementRang);
            textView.setText(String.valueOf(i11));
            Typeface typeface = this.f94207e;
            textView.setTypeface(typeface);
            textView.setTextColor(-16777216);
            View viewFindViewById = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementRangImage);
            e0.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById;
            if (i11 == 1) {
                imageView.setBackgroundResource(R.drawable.mini_gold_medal);
            } else if (i11 == 2) {
                imageView.setBackgroundResource(R.drawable.mini_silver_medal);
            } else if (i11 != 3) {
                textView.setTextColor(-16777216);
            } else {
                imageView.setBackgroundResource(R.drawable.mini_bronze_medal);
                textView.setTextColor(-1);
            }
            View viewFindViewById2 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementMedaille);
            e0.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            TextView textView2 = (TextView) viewFindViewById2;
            textView2.setTypeface(typeface);
            if (bVar.getNbTropheGold() > 0) {
                textView2.setText(String.valueOf(bVar.getNbTropheGold()));
                textView2.setBackgroundResource(R.drawable.mini_star_gold);
            } else if (bVar.getNbTropheSilver() > 0) {
                textView2.setText(String.valueOf(bVar.getNbTropheSilver()));
                textView2.setBackgroundResource(R.drawable.mini_star_silver);
                textView2.setTextColor(-1);
            } else if (bVar.getNbTropheBronze() > 0) {
                textView2.setText(String.valueOf(bVar.getNbTropheBronze()));
                textView2.setBackgroundResource(R.drawable.mini_star_bronze);
            } else {
                textView2.setTextColor(-16777216);
                textView2.setVisibility(4);
            }
            View viewFindViewById3 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementNom);
            e0.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            TextView textView3 = (TextView) viewFindViewById3;
            textView3.setText(String.valueOf(bVar.getPseudo()));
            textView3.setTypeface(typeface);
            View viewFindViewById4 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementScore);
            e0.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            ((TextView) viewFindViewById4).setVisibility(4);
            View viewFindViewById5 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementBadgeBlack);
            e0.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            TextView textView4 = (TextView) viewFindViewById5;
            View viewFindViewById6 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementBadgePlatinum);
            e0.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            TextView textView5 = (TextView) viewFindViewById6;
            View viewFindViewById7 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementBadgeGold);
            e0.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            TextView textView6 = (TextView) viewFindViewById7;
            View viewFindViewById8 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementBadgeSilver);
            e0.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
            TextView textView7 = (TextView) viewFindViewById8;
            View viewFindViewById9 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementBadgeBronze);
            e0.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
            TextView textView8 = (TextView) viewFindViewById9;
            View viewFindViewById10 = podiumJoueur$akinatorGL_gplayFreemiumRelease.findViewById(R.id.classementBadgeDdj);
            e0.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
            TextView textView9 = (TextView) viewFindViewById10;
            a(textView4, bVar.getNbAwardsBlack());
            a(textView5, bVar.getNbAwardsPlatinum());
            a(textView6, bVar.getNbAwardsGold());
            a(textView7, bVar.getNbAwardsSilver());
            a(textView8, bVar.getNbAwardsBronze());
            a(textView9, bVar.getNbTropheDefi());
            textView4.setTypeface(typeface);
            textView5.setTypeface(typeface);
            textView6.setTypeface(typeface);
            textView7.setTypeface(typeface);
            textView8.setTypeface(typeface);
            textView9.setTypeface(typeface);
        }
        e0.checkNotNull(view, "null cannot be cast to non-null type android.view.View");
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return false;
    }

    @Override // android.widget.Adapter
    public void getItem(int i10) {
        ArrayList<k.b> legends = this.f94206c.getLegends();
        e0.checkNotNull(legends);
        legends.get(i10);
    }
}
