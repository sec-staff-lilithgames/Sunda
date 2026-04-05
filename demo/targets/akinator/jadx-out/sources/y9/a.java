package y9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.e0;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f94145b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f94146c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f94147e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f94148f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f94149g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: y9.a$a, reason: collision with other inner class name */
    public static final class C0814a {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f94150a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f94151b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f94152c;

        /* renamed from: d, reason: collision with root package name */
        public ImageView f94153d;

        public final TextView getGetUiCharacterDescText() {
            return this.f94152c;
        }

        public final ImageView getMUiImageResult() {
            return this.f94153d;
        }

        public final TextView getUiCharacterNameText() {
            return this.f94151b;
        }

        public final RelativeLayout getUiMainLayout() {
            return this.f94150a;
        }

        public final void setGetUiCharacterDescText(TextView textView) {
            this.f94152c = textView;
        }

        public final void setMUiImageResult(ImageView imageView) {
            this.f94153d = imageView;
        }

        public final void setUiCharacterNameText(TextView textView) {
            this.f94151b = textView;
        }

        public final void setUiMainLayout(RelativeLayout relativeLayout) {
            this.f94150a = relativeLayout;
        }
    }

    public a(Context context, ArrayList<e.b> mCharacters, ArrayList<Bitmap> arrayList) {
        e0.checkNotNullParameter(mCharacters, "mCharacters");
        this.f94145b = mCharacters;
        this.f94146c = arrayList;
        this.f94147e = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94148f = layoutInflaterFrom;
        this.f94149g = new HashSet();
    }

    public final void addSelectedItem(Integer num) {
        this.f94149g.add(num);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94145b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f94145b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    public final HashSet<Integer> getSelectedItemsIndex() {
        return this.f94149g;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View viewInflate;
        C0814a c0814a;
        if (view == null) {
            c0814a = new C0814a();
            viewInflate = this.f94148f.inflate(R.layout.item_character, (ViewGroup) null);
            c0814a.setMUiImageResult((ImageView) viewInflate.findViewById(R.id.imageResult));
            if (!ca.m.sharedInstance().canDownloadPicture()) {
                ImageView mUiImageResult = c0814a.getMUiImageResult();
                e0.checkNotNull(mUiImageResult);
                mUiImageResult.setVisibility(8);
            }
            c0814a.setUiCharacterNameText((TextView) viewInflate.findViewById(R.id.character_name));
            TextView uiCharacterNameText = c0814a.getUiCharacterNameText();
            e0.checkNotNull(uiCharacterNameText);
            TextView uiCharacterNameText2 = c0814a.getUiCharacterNameText();
            e0.checkNotNull(uiCharacterNameText2);
            float textSize = uiCharacterNameText2.getTextSize();
            AkApplication.a aVar = AkApplication.f21719f;
            uiCharacterNameText.setTextSize(0, aVar.getCoeffFont() * textSize);
            TextView uiCharacterNameText3 = c0814a.getUiCharacterNameText();
            e0.checkNotNull(uiCharacterNameText3);
            Typeface typeface = this.f94147e;
            uiCharacterNameText3.setTypeface(typeface);
            c0814a.setGetUiCharacterDescText((TextView) viewInflate.findViewById(R.id.character_description));
            TextView getUiCharacterDescText = c0814a.getGetUiCharacterDescText();
            e0.checkNotNull(getUiCharacterDescText);
            TextView uiCharacterNameText4 = c0814a.getUiCharacterNameText();
            e0.checkNotNull(uiCharacterNameText4);
            getUiCharacterDescText.setTextSize(0, aVar.getCoeffFont() * uiCharacterNameText4.getTextSize());
            TextView getUiCharacterDescText2 = c0814a.getGetUiCharacterDescText();
            e0.checkNotNull(getUiCharacterDescText2);
            getUiCharacterDescText2.setTypeface(typeface);
            c0814a.setUiMainLayout((RelativeLayout) viewInflate.findViewById(R.id.layout_character));
            viewInflate.setTag(c0814a);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.AkCharacterAdapter.ViewHolder");
            C0814a c0814a2 = (C0814a) tag;
            viewInflate = view;
            c0814a = c0814a2;
        }
        TextView uiCharacterNameText5 = c0814a.getUiCharacterNameText();
        e0.checkNotNull(uiCharacterNameText5);
        ArrayList arrayList = this.f94145b;
        Object obj = arrayList.get(i10);
        e0.checkNotNull(obj);
        uiCharacterNameText5.setText(((e.b) obj).getName());
        TextView getUiCharacterDescText3 = c0814a.getGetUiCharacterDescText();
        e0.checkNotNull(getUiCharacterDescText3);
        Object obj2 = arrayList.get(i10);
        e0.checkNotNull(obj2);
        getUiCharacterDescText3.setText(((e.b) obj2).getDescription());
        ArrayList arrayList2 = this.f94146c;
        if (arrayList2 != null && arrayList2.size() > i10) {
            ImageView mUiImageResult2 = c0814a.getMUiImageResult();
            e0.checkNotNull(mUiImageResult2);
            mUiImageResult2.setImageBitmap((Bitmap) arrayList2.get(i10));
        }
        if (this.f94149g.contains(Integer.valueOf(i10))) {
            RelativeLayout uiMainLayout = c0814a.getUiMainLayout();
            e0.checkNotNull(uiMainLayout);
            uiMainLayout.setBackgroundResource(R.drawable.background_textbox_pressed);
        } else {
            RelativeLayout uiMainLayout2 = c0814a.getUiMainLayout();
            e0.checkNotNull(uiMainLayout2);
            uiMainLayout2.setBackgroundResource(R.drawable.background_textbox_unpressed);
        }
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }

    public final void removeSelectedItem(Integer num) {
        this.f94149g.remove(num);
        notifyDataSetChanged();
    }

    public final void unselectAll(boolean z10) {
        this.f94149g.clear();
        if (z10) {
            notifyDataSetChanged();
        }
    }
}
