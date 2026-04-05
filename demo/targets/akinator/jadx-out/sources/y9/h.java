package y9;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f94193b;

    /* renamed from: c, reason: collision with root package name */
    public int f94194c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f94195e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f94196f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f94197a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f94198b;

        public final RelativeLayout getUiMainLayout() {
            return this.f94197a;
        }

        public final TextView getUiSoundlikeQuestionText() {
            return this.f94198b;
        }

        public final void setUiMainLayout(RelativeLayout relativeLayout) {
            this.f94197a = relativeLayout;
        }

        public final void setUiSoundlikeQuestionText(TextView textView) {
            this.f94198b = textView;
        }
    }

    public h(Context context, ArrayList<e.h> mSoundlikesQuestions, int i10) {
        e0.checkNotNullParameter(mSoundlikesQuestions, "mSoundlikesQuestions");
        this.f94193b = mSoundlikesQuestions;
        this.f94194c = i10;
        this.f94195e = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94196f = layoutInflaterFrom;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94193b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f94193b.get(i10);
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
            viewInflate = this.f94196f.inflate(R.layout.item_soundlike_question, (ViewGroup) null);
            aVar.setUiMainLayout((RelativeLayout) viewInflate.findViewById(R.id.mainLayout));
            aVar.setUiSoundlikeQuestionText((TextView) viewInflate.findViewById(R.id.soundlike_name));
            TextView uiSoundlikeQuestionText = aVar.getUiSoundlikeQuestionText();
            e0.checkNotNull(uiSoundlikeQuestionText);
            TextView uiSoundlikeQuestionText2 = aVar.getUiSoundlikeQuestionText();
            e0.checkNotNull(uiSoundlikeQuestionText2);
            uiSoundlikeQuestionText.setTextSize(0, AkApplication.f21719f.getCoeffFont() * uiSoundlikeQuestionText2.getTextSize());
            TextView uiSoundlikeQuestionText3 = aVar.getUiSoundlikeQuestionText();
            e0.checkNotNull(uiSoundlikeQuestionText3);
            uiSoundlikeQuestionText3.setTypeface(this.f94195e);
            viewInflate.setTag(aVar);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.AkSoundlikeQuestionAdapter.ViewHolder");
            a aVar2 = (a) tag;
            viewInflate = view;
            aVar = aVar2;
        }
        TextView uiSoundlikeQuestionText4 = aVar.getUiSoundlikeQuestionText();
        e0.checkNotNull(uiSoundlikeQuestionText4);
        Object obj = this.f94193b.get(i10);
        e0.checkNotNull(obj);
        uiSoundlikeQuestionText4.setText(((e.h) obj).getQuestion());
        if (i10 == this.f94194c) {
            RelativeLayout uiMainLayout = aVar.getUiMainLayout();
            e0.checkNotNull(uiMainLayout);
            uiMainLayout.setBackgroundResource(R.drawable.background_textbox_pressed);
        } else {
            RelativeLayout uiMainLayout2 = aVar.getUiMainLayout();
            e0.checkNotNull(uiMainLayout2);
            uiMainLayout2.setBackgroundResource(R.drawable.background_textbox_unpressed);
        }
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }

    public final void setSelectedItem(int i10) {
        this.f94194c = i10;
        notifyDataSetChanged();
    }
}
