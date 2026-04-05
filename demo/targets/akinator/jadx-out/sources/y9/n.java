package y9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
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
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final List f94251b;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f94252c;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f94253e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f94254a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f94255b;

        /* renamed from: c, reason: collision with root package name */
        public ImageView f94256c;

        public final ImageView getMUiImageTheme() {
            return this.f94256c;
        }

        public final RelativeLayout getUiMainLayout() {
            return this.f94254a;
        }

        public final TextView getUiThemeText() {
            return this.f94255b;
        }

        public final void setMUiImageTheme(ImageView imageView) {
            this.f94256c = imageView;
        }

        public final void setUiMainLayout(RelativeLayout relativeLayout) {
            this.f94254a = relativeLayout;
        }

        public final void setUiThemeText(TextView textView) {
            this.f94255b = textView;
        }
    }

    public n(Context context, List<kb.d> mData) {
        e0.checkNotNullParameter(mData, "mData");
        this.f94251b = mData;
        this.f94252c = AkApplication.f21719f.getTypeFace();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        e0.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.f94253e = layoutInflaterFrom;
        ca.m.sharedInstance().getCurrentSubject();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94251b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f94251b.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            a aVar2 = new a();
            View viewInflate = this.f94253e.inflate(R.layout.item_subject_icon, (ViewGroup) null);
            aVar2.setMUiImageTheme((ImageView) viewInflate.findViewById(R.id.itemIcon));
            aVar2.setUiMainLayout((RelativeLayout) viewInflate.findViewById(R.id.mainLayout));
            aVar2.setUiThemeText((TextView) viewInflate.findViewById(R.id.textTheme));
            TextView uiThemeText = aVar2.getUiThemeText();
            e0.checkNotNull(uiThemeText);
            uiThemeText.setTypeface(this.f94252c);
            viewInflate.setTag(aVar2);
            aVar = aVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.ThemeSelectionAdapter.ViewHolder");
            aVar = (a) tag;
        }
        List list = this.f94251b;
        Object obj = list.get(i10);
        e0.checkNotNull(obj);
        Integer num = (Integer) ((kb.d) obj).getFirst();
        String str = (num != null && num.intValue() == 1) ? "#806600CC" : (num != null && num.intValue() == 14) ? "#8000FF00" : (num != null && num.intValue() == 13) ? "#800000FF" : (num != null && num.intValue() == 2) ? "#80FF0000" : (num != null && num.intValue() == 7) ? "#80FF4500" : "#80000000";
        TextView uiThemeText2 = aVar.getUiThemeText();
        e0.checkNotNull(uiThemeText2);
        Object obj2 = list.get(i10);
        e0.checkNotNull(obj2);
        uiThemeText2.setText((CharSequence) ((kb.d) obj2).getFourth());
        int currentSubject = ca.m.sharedInstance().getCurrentSubject();
        Object obj3 = list.get(i10);
        e0.checkNotNull(obj3);
        Integer num2 = (Integer) ((kb.d) obj3).getFirst();
        if (num2 != null && currentSubject == num2.intValue()) {
            ImageView mUiImageTheme = aVar.getMUiImageTheme();
            e0.checkNotNull(mUiImageTheme);
            Object obj4 = list.get(i10);
            e0.checkNotNull(obj4);
            mUiImageTheme.setImageBitmap((Bitmap) ((kb.d) obj4).getThird());
            RelativeLayout uiMainLayout = aVar.getUiMainLayout();
            e0.checkNotNull(uiMainLayout);
            uiMainLayout.setBackgroundColor(Color.parseColor(str));
        } else {
            ImageView mUiImageTheme2 = aVar.getMUiImageTheme();
            e0.checkNotNull(mUiImageTheme2);
            Object obj5 = list.get(i10);
            e0.checkNotNull(obj5);
            mUiImageTheme2.setImageBitmap((Bitmap) ((kb.d) obj5).getSecond());
            RelativeLayout uiMainLayout2 = aVar.getUiMainLayout();
            e0.checkNotNull(uiMainLayout2);
            uiMainLayout2.setBackgroundColor(0);
        }
        e0.checkNotNull(view);
        return view;
    }

    public final void selectItem(int i10) {
        notifyDataSetChanged();
    }
}
