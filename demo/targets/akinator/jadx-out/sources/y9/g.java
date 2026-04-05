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
import lb.b1;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f94184b;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f94185c;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f94186e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f94187a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f94188b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f94189c;

        /* renamed from: d, reason: collision with root package name */
        public TextView f94190d;

        /* renamed from: e, reason: collision with root package name */
        public View f94191e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f94192f;

        public final TextView getExpectedAnswer() {
            return this.f94190d;
        }

        public final TextView getExpectedAnswerLabel() {
            return this.f94192f;
        }

        public final TextView getGivenAnswer() {
            return this.f94189c;
        }

        public final View getLayoutExpectedAnswer() {
            return this.f94191e;
        }

        public final RelativeLayout getLayoutReportMain() {
            return this.f94187a;
        }

        public final TextView getQuestion() {
            return this.f94188b;
        }

        public final void setExpectedAnswer(TextView textView) {
            this.f94190d = textView;
        }

        public final void setExpectedAnswerLabel(TextView textView) {
            this.f94192f = textView;
        }

        public final void setGivenAnswer(TextView textView) {
            this.f94189c = textView;
        }

        public final void setLayoutExpectedAnswer(View view) {
            this.f94191e = view;
        }

        public final void setLayoutReportMain(RelativeLayout relativeLayout) {
            this.f94187a = relativeLayout;
        }

        public final void setQuestion(TextView textView) {
            this.f94188b = textView;
        }
    }

    public g(Context context, ArrayList<e.C0742e> mReports) {
        e0.checkNotNullParameter(mReports, "mReports");
        this.f94184b = mReports;
        this.f94185c = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94186e = layoutInflaterFrom;
    }

    public final void clear() {
        this.f94184b.clear();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94184b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f94184b.get(i10);
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
            viewInflate = this.f94186e.inflate(R.layout.item_report, (ViewGroup) null);
            aVar.setLayoutReportMain((RelativeLayout) viewInflate.findViewById(R.id.layoutReportMain));
            aVar.setQuestion((TextView) viewInflate.findViewById(R.id.reportAnswer));
            aVar.setGivenAnswer((TextView) viewInflate.findViewById(R.id.report_givenAnswerResponse));
            aVar.setExpectedAnswer((TextView) viewInflate.findViewById(R.id.report_expectedAnswerResponse));
            aVar.setLayoutExpectedAnswer(viewInflate.findViewById(R.id.layoutExpectedAnswer));
            aVar.setExpectedAnswerLabel((TextView) viewInflate.findViewById(R.id.report_expectedAnswerLabel));
            TextView question = aVar.getQuestion();
            e0.checkNotNull(question);
            Typeface typeface = this.f94185c;
            question.setTypeface(typeface);
            TextView givenAnswer = aVar.getGivenAnswer();
            e0.checkNotNull(givenAnswer);
            givenAnswer.setTypeface(typeface);
            TextView expectedAnswer = aVar.getExpectedAnswer();
            e0.checkNotNull(expectedAnswer);
            expectedAnswer.setTypeface(typeface);
            TextView expectedAnswerLabel = aVar.getExpectedAnswerLabel();
            e0.checkNotNull(expectedAnswerLabel);
            expectedAnswerLabel.setTypeface(typeface);
            TextView question2 = aVar.getQuestion();
            e0.checkNotNull(question2);
            TextView question3 = aVar.getQuestion();
            e0.checkNotNull(question3);
            float textSize = question3.getTextSize();
            AkApplication.a aVar2 = AkApplication.f21719f;
            question2.setTextSize(0, aVar2.getCoeffFont() * textSize);
            TextView givenAnswer2 = aVar.getGivenAnswer();
            e0.checkNotNull(givenAnswer2);
            TextView givenAnswer3 = aVar.getGivenAnswer();
            e0.checkNotNull(givenAnswer3);
            givenAnswer2.setTextSize(0, aVar2.getCoeffFont() * givenAnswer3.getTextSize());
            TextView expectedAnswer2 = aVar.getExpectedAnswer();
            e0.checkNotNull(expectedAnswer2);
            TextView expectedAnswer3 = aVar.getExpectedAnswer();
            e0.checkNotNull(expectedAnswer3);
            expectedAnswer2.setTextSize(0, aVar2.getCoeffFont() * expectedAnswer3.getTextSize());
            TextView expectedAnswerLabel2 = aVar.getExpectedAnswerLabel();
            e0.checkNotNull(expectedAnswerLabel2);
            TextView expectedAnswerLabel3 = aVar.getExpectedAnswerLabel();
            e0.checkNotNull(expectedAnswerLabel3);
            expectedAnswerLabel2.setTextSize(0, aVar2.getCoeffFont() * expectedAnswerLabel3.getTextSize());
            viewInflate.setTag(aVar);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.AkReportAdapter.ViewHolder");
            a aVar3 = (a) tag;
            viewInflate = view;
            aVar = aVar3;
        }
        e.C0742e c0742e = (e.C0742e) this.f94184b.get(i10);
        if (c0742e != null) {
            String questionLabel = c0742e.getQuestionLabel();
            String givenAnswer4 = c0742e.getGivenAnswer();
            String expectedAnswer4 = c0742e.getExpectedAnswer();
            int groupeGivenAnswer = c0742e.getGroupeGivenAnswer();
            int groupeExpectedAnswer = c0742e.getGroupeExpectedAnswer();
            if (groupeExpectedAnswer == -1) {
                RelativeLayout layoutReportMain = aVar.getLayoutReportMain();
                e0.checkNotNull(layoutReportMain);
                layoutReportMain.setBackgroundResource(R.drawable.background_textbox_blue);
                View layoutExpectedAnswer = aVar.getLayoutExpectedAnswer();
                e0.checkNotNull(layoutExpectedAnswer);
                layoutExpectedAnswer.setVisibility(8);
            } else if ((groupeGivenAnswer == 0 && groupeExpectedAnswer == 0) || ((groupeGivenAnswer == 1 && groupeExpectedAnswer == 1) || (groupeGivenAnswer == 2 && groupeExpectedAnswer == 2))) {
                RelativeLayout layoutReportMain2 = aVar.getLayoutReportMain();
                e0.checkNotNull(layoutReportMain2);
                layoutReportMain2.setBackgroundResource(R.drawable.background_textbox_green);
                View layoutExpectedAnswer2 = aVar.getLayoutExpectedAnswer();
                e0.checkNotNull(layoutExpectedAnswer2);
                layoutExpectedAnswer2.setVisibility(8);
            } else {
                RelativeLayout layoutReportMain3 = aVar.getLayoutReportMain();
                e0.checkNotNull(layoutReportMain3);
                layoutReportMain3.setBackgroundResource(R.drawable.background_textbox_red);
                View layoutExpectedAnswer3 = aVar.getLayoutExpectedAnswer();
                e0.checkNotNull(layoutExpectedAnswer3);
                layoutExpectedAnswer3.setVisibility(0);
            }
            TextView question4 = aVar.getQuestion();
            e0.checkNotNull(question4);
            question4.setText(questionLabel);
            TextView givenAnswer5 = aVar.getGivenAnswer();
            e0.checkNotNull(givenAnswer5);
            givenAnswer5.setText(givenAnswer4);
            TextView expectedAnswer5 = aVar.getExpectedAnswer();
            e0.checkNotNull(expectedAnswer5);
            expectedAnswer5.setText(expectedAnswer4);
        }
        TextView expectedAnswerLabel4 = aVar.getExpectedAnswerLabel();
        e0.checkNotNull(expectedAnswerLabel4);
        expectedAnswerLabel4.setText(b1.f72741d.sharedInstance().getTraductionFromToken("REPONSE_ATTENDUE") + "  ");
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return false;
    }
}
