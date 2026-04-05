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
import j1.o2;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import lb.b1;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f94154b;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f94155c;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f94156e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public e.b f94157a;

        /* renamed from: b, reason: collision with root package name */
        public int f94158b;

        public final int getAnswer() {
            return this.f94158b;
        }

        public final e.b getObject() {
            return this.f94157a;
        }

        public final void setAnswer(int i10) {
            this.f94158b = i10;
        }

        public final void setObject(e.b bVar) {
            this.f94157a = bVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: y9.b$b, reason: collision with other inner class name */
    public static final class C0815b {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f94159a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f94160b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f94161c;

        /* renamed from: d, reason: collision with root package name */
        public TextView f94162d;

        public final TextView getUiCharacterNameText() {
            return this.f94160b;
        }

        public final TextView getUiCharacterResponseLabel() {
            return this.f94161c;
        }

        public final TextView getUiCharacterResponseValue() {
            return this.f94162d;
        }

        public final ImageView getUicharacterItemBackground() {
            return this.f94159a;
        }

        public final void setUiCharacterNameText(TextView textView) {
            this.f94160b = textView;
        }

        public final void setUiCharacterResponseLabel(TextView textView) {
            this.f94161c = textView;
        }

        public final void setUiCharacterResponseValue(TextView textView) {
            this.f94162d = textView;
        }

        public final void setUicharacterItemBackground(ImageView imageView) {
            this.f94159a = imageView;
        }
    }

    public b(Context context, ArrayList<a> mCharacters) {
        e0.checkNotNullParameter(mCharacters, "mCharacters");
        this.f94154b = mCharacters;
        this.f94155c = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94156e = layoutInflaterFrom;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94154b.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return super.getDropDownView(i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f94154b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View viewInflate;
        C0815b c0815b;
        if (view == null) {
            c0815b = new C0815b();
            viewInflate = this.f94156e.inflate(R.layout.item_character_answer, (ViewGroup) null);
            c0815b.setUicharacterItemBackground((ImageView) viewInflate.findViewById(R.id.character_item_background));
            c0815b.setUiCharacterNameText((TextView) viewInflate.findViewById(R.id.character_name));
            c0815b.setUiCharacterResponseLabel((TextView) viewInflate.findViewById(R.id.responseLabel));
            c0815b.setUiCharacterResponseValue((TextView) viewInflate.findViewById(R.id.responseValue));
            TextView uiCharacterResponseValue = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue);
            TextView uiCharacterResponseValue2 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue2);
            float textSize = uiCharacterResponseValue2.getTextSize();
            AkApplication.a aVar = AkApplication.f21719f;
            uiCharacterResponseValue.setTextSize(0, aVar.getCoeffFont() * textSize);
            TextView uiCharacterResponseLabel = c0815b.getUiCharacterResponseLabel();
            e0.checkNotNull(uiCharacterResponseLabel);
            TextView uiCharacterResponseLabel2 = c0815b.getUiCharacterResponseLabel();
            e0.checkNotNull(uiCharacterResponseLabel2);
            uiCharacterResponseLabel.setTextSize(0, aVar.getCoeffFont() * uiCharacterResponseLabel2.getTextSize());
            TextView uiCharacterNameText = c0815b.getUiCharacterNameText();
            e0.checkNotNull(uiCharacterNameText);
            TextView uiCharacterNameText2 = c0815b.getUiCharacterNameText();
            e0.checkNotNull(uiCharacterNameText2);
            uiCharacterNameText.setTextSize(0, aVar.getCoeffFont() * uiCharacterNameText2.getTextSize());
            TextView uiCharacterNameText3 = c0815b.getUiCharacterNameText();
            e0.checkNotNull(uiCharacterNameText3);
            Typeface typeface = this.f94155c;
            uiCharacterNameText3.setTypeface(typeface);
            TextView uiCharacterResponseLabel3 = c0815b.getUiCharacterResponseLabel();
            e0.checkNotNull(uiCharacterResponseLabel3);
            uiCharacterResponseLabel3.setTypeface(typeface);
            TextView uiCharacterResponseValue3 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue3);
            uiCharacterResponseValue3.setTypeface(typeface);
            TextView uiCharacterResponseLabel4 = c0815b.getUiCharacterResponseLabel();
            e0.checkNotNull(uiCharacterResponseLabel4);
            b1.a aVar2 = b1.f72741d;
            uiCharacterResponseLabel4.setText(aVar2.sharedInstance().getTraductionFromToken("REPONSE") + " :");
            TextView uiCharacterResponseValue4 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue4);
            uiCharacterResponseValue4.setText(aVar2.sharedInstance().getTraductionFromToken("SELECTIONNEZ"));
            viewInflate.setTag(c0815b);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.AkCharacterAnswerAdapter.ViewHolder");
            C0815b c0815b2 = (C0815b) tag;
            viewInflate = view;
            c0815b = c0815b2;
        }
        TextView uiCharacterNameText4 = c0815b.getUiCharacterNameText();
        e0.checkNotNull(uiCharacterNameText4);
        ArrayList arrayList = this.f94154b;
        Object obj = arrayList.get(i10);
        e0.checkNotNull(obj);
        e.b object = ((a) obj).getObject();
        e0.checkNotNull(object);
        uiCharacterNameText4.setText(object.getName());
        Object obj2 = arrayList.get(i10);
        e0.checkNotNull(obj2);
        int answer = ((a) obj2).getAnswer();
        if (answer == -1) {
            ImageView uicharacterItemBackground = c0815b.getUicharacterItemBackground();
            e0.checkNotNull(uicharacterItemBackground);
            uicharacterItemBackground.setImageResource(R.drawable.background_textbox_unpressed);
            TextView uiCharacterResponseValue5 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue5);
            o2.A(b1.f72741d, "JE_NE_CONNAIS_PAS_LA_REPONSE", uiCharacterResponseValue5);
        } else if (answer == 0) {
            ImageView uicharacterItemBackground2 = c0815b.getUicharacterItemBackground();
            e0.checkNotNull(uicharacterItemBackground2);
            uicharacterItemBackground2.setImageResource(R.drawable.background_textbox_pressed);
            TextView uiCharacterResponseValue6 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue6);
            o2.A(b1.f72741d, "OUI", uiCharacterResponseValue6);
        } else if (answer == 1) {
            ImageView uicharacterItemBackground3 = c0815b.getUicharacterItemBackground();
            e0.checkNotNull(uicharacterItemBackground3);
            uicharacterItemBackground3.setImageResource(R.drawable.background_textbox_pressed);
            TextView uiCharacterResponseValue7 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue7);
            o2.A(b1.f72741d, "NON", uiCharacterResponseValue7);
        } else if (answer == 2) {
            ImageView uicharacterItemBackground4 = c0815b.getUicharacterItemBackground();
            e0.checkNotNull(uicharacterItemBackground4);
            uicharacterItemBackground4.setImageResource(R.drawable.background_textbox_pressed);
            TextView uiCharacterResponseValue8 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue8);
            o2.A(b1.f72741d, "NE_SAIS_PAS", uiCharacterResponseValue8);
        } else if (answer == 3) {
            ImageView uicharacterItemBackground5 = c0815b.getUicharacterItemBackground();
            e0.checkNotNull(uicharacterItemBackground5);
            uicharacterItemBackground5.setImageResource(R.drawable.background_textbox_pressed);
            TextView uiCharacterResponseValue9 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue9);
            o2.A(b1.f72741d, "PROBABLEMENT", uiCharacterResponseValue9);
        } else if (answer != 4) {
            ImageView uicharacterItemBackground6 = c0815b.getUicharacterItemBackground();
            e0.checkNotNull(uicharacterItemBackground6);
            uicharacterItemBackground6.setImageResource(R.drawable.background_textbox_unpressed);
            TextView uiCharacterResponseValue10 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue10);
            o2.A(b1.f72741d, "SELECTIONNER", uiCharacterResponseValue10);
        } else {
            ImageView uicharacterItemBackground7 = c0815b.getUicharacterItemBackground();
            e0.checkNotNull(uicharacterItemBackground7);
            uicharacterItemBackground7.setImageResource(R.drawable.background_textbox_pressed);
            TextView uiCharacterResponseValue11 = c0815b.getUiCharacterResponseValue();
            e0.checkNotNull(uiCharacterResponseValue11);
            o2.A(b1.f72741d, "PROBABLEMENT_PAS", uiCharacterResponseValue11);
        }
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }
}
