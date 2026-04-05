package y9;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.c1;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import lb.b1;
import timber.log.Timber;
import xv.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f94172b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f94173c;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f94174e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap[] f94175f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f94176g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final f f94177a;

        /* renamed from: b, reason: collision with root package name */
        public final List f94178b;

        /* renamed from: c, reason: collision with root package name */
        public final int f94179c;

        /* renamed from: d, reason: collision with root package name */
        public final l0 f94180d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f94181e;

        public a(f fVar, f adapter, List<b1.b> mLanguages, int i10, l0 client) {
            e0.checkNotNullParameter(adapter, "adapter");
            e0.checkNotNullParameter(mLanguages, "mLanguages");
            e0.checkNotNullParameter(client, "client");
            this.f94181e = fVar;
            this.f94177a = adapter;
            this.f94178b = mLanguages;
            this.f94179c = i10;
            this.f94180d = client;
        }

        public static final Object access$downloadFlag(a aVar, String str, zu.d dVar) {
            aVar.getClass();
            return BuildersKt.withContext(Dispatchers.getIO(), new d(aVar, str, null), dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object execute(zu.d<? super tu.x0> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof y9.e
                if (r0 == 0) goto L13
                r0 = r8
                y9.e r0 = (y9.e) r0
                int r1 = r0.f94171l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f94171l = r1
                goto L18
            L13:
                y9.e r0 = new y9.e
                r0.<init>(r7, r8)
            L18:
                java.lang.Object r8 = r0.f94169j
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f94171l
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L34
                if (r2 != r3) goto L2c
                y9.f$a r0 = r0.f94168i
                tu.a0.throwOnFailure(r8)
                goto L5e
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L34:
                tu.a0.throwOnFailure(r8)
                java.util.List r8 = r7.f94178b
                int r2 = r7.f94179c
                java.lang.Object r8 = r8.get(r2)
                lb.b1$b r8 = (lb.b1.b) r8
                if (r8 == 0) goto L48
                java.lang.String r8 = r8.getFlagUrl()
                goto L49
            L48:
                r8 = r4
            L49:
                r0.f94168i = r7
                r0.f94171l = r3
                kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
                y9.d r3 = new y9.d
                r3.<init>(r7, r8, r4)
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r2, r3, r0)
                if (r8 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
                timber.log.Timber$Forest r1 = timber.log.Timber.Forest
                java.lang.String r2 = "AsynchFlagLoader"
                timber.log.Timber$Tree r1 = r1.tag(r2)
                int r2 = r0.f94179c
                if (r8 == 0) goto L75
                int r3 = r8.getWidth()
                java.lang.Integer r3 = bv.b.boxInt(r3)
                goto L76
            L75:
                r3 = r4
            L76:
                if (r8 == 0) goto L80
                int r4 = r8.getHeight()
                java.lang.Integer r4 = bv.b.boxInt(r4)
            L80:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "Pos "
                r5.<init>(r6)
                r5.append(r2)
                java.lang.String r2 = " Downloaded flag : "
                r5.append(r2)
                r5.append(r3)
                java.lang.String r2 = "x"
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r1.v(r2, r3)
                y9.f r1 = r0.f94181e
                android.graphics.Bitmap[] r1 = y9.f.access$getFlags$p(r1)
                int r2 = r0.f94179c
                r1[r2] = r8
                y9.f r8 = r0.f94177a
                r8.notifyDataSetChanged()
                tu.x0 r8 = tu.x0.f87415a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y9.f.a.execute(zu.d):java.lang.Object");
        }

        public final f getAdapter() {
            return this.f94177a;
        }

        public final l0 getClient() {
            return this.f94180d;
        }

        public final List<b1.b> getMLanguages() {
            return this.f94178b;
        }

        public final int getPosition() {
            return this.f94179c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public TextView f94182a;

        /* renamed from: b, reason: collision with root package name */
        public ImageView f94183b;

        public final ImageView getUiLanguageCoche() {
            return this.f94183b;
        }

        public final TextView getUiLanguageText() {
            return this.f94182a;
        }

        public final void setUiLanguageCoche(ImageView imageView) {
            this.f94183b = imageView;
        }

        public final void setUiLanguageText(TextView textView) {
            this.f94182a = textView;
        }
    }

    public f(ComponentActivity ctx, ArrayList<b1.b> languages) {
        e0.checkNotNullParameter(ctx, "ctx");
        e0.checkNotNullParameter(languages, "languages");
        this.f94172b = AkApplication.f21719f.getTypeFaceRaleReg();
        this.f94176g = new l0();
        int size = languages.size();
        this.f94174e = LayoutInflater.from(ctx);
        this.f94175f = new Bitmap[size];
        this.f94173c = languages;
        for (int i10 = 0; i10 < size; i10++) {
            this.f94175f[i10] = null;
            BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(ctx), null, null, new c(this, i10, null), 3, null);
        }
    }

    public final void clear() {
        for (Bitmap bitmap : this.f94175f) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94173c.size();
    }

    public final Bitmap getFlag(int i10) {
        if (i10 < 0) {
            return null;
        }
        Bitmap[] bitmapArr = this.f94175f;
        if (i10 > bitmapArr.length) {
            return null;
        }
        return bitmapArr[i10];
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f94173c.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View viewInflate;
        b bVar;
        ArrayList arrayList = this.f94173c;
        if (view == null) {
            Timber.Tree treeTag = Timber.Forest.tag("AkLanguageSelAdapter");
            Object obj = arrayList.get(i10);
            e0.checkNotNull(obj);
            treeTag.v("convertView null pos " + i10 + " for : " + ((b1.b) obj).getLabel(), new Object[0]);
            bVar = new b();
            viewInflate = this.f94174e.inflate(R.layout.item_language_select, (ViewGroup) null);
            bVar.setUiLanguageText((TextView) viewInflate.findViewById(R.id.language_name));
            bVar.setUiLanguageCoche((ImageView) viewInflate.findViewById(R.id.cocheLangue));
            TextView uiLanguageText = bVar.getUiLanguageText();
            e0.checkNotNull(uiLanguageText);
            TextView uiLanguageText2 = bVar.getUiLanguageText();
            e0.checkNotNull(uiLanguageText2);
            uiLanguageText.setTextSize(0, AkApplication.f21719f.getCoeffFont() * uiLanguageText2.getTextSize());
            TextView uiLanguageText3 = bVar.getUiLanguageText();
            e0.checkNotNull(uiLanguageText3);
            uiLanguageText3.setTypeface(this.f94172b);
            viewInflate.setTag(bVar);
        } else {
            Object tag = view.getTag();
            e0.checkNotNull(tag, "null cannot be cast to non-null type com.digidust.elokence.akinator.adapters.AkLanguageSelectionAdapter.ViewHolder");
            b bVar2 = (b) tag;
            viewInflate = view;
            bVar = bVar2;
        }
        if (i10 != 0) {
            TextView uiLanguageText4 = bVar.getUiLanguageText();
            e0.checkNotNull(uiLanguageText4);
            Object obj2 = arrayList.get(i10);
            e0.checkNotNull(obj2);
            uiLanguageText4.setText(((b1.b) obj2).getLabel());
        } else {
            TextView uiLanguageText5 = bVar.getUiLanguageText();
            e0.checkNotNull(uiLanguageText5);
            Object obj3 = arrayList.get(i10);
            e0.checkNotNull(obj3);
            uiLanguageText5.setText(ca.n.Convert(((b1.b) obj3).getLabel()));
        }
        Object obj4 = arrayList.get(i10);
        e0.checkNotNull(obj4);
        if (e0.areEqual(((b1.b) obj4).getCode(), ca.m.sharedInstance().getCurrentLanguage())) {
            ImageView uiLanguageCoche = bVar.getUiLanguageCoche();
            e0.checkNotNull(uiLanguageCoche);
            uiLanguageCoche.setVisibility(0);
        } else {
            ImageView uiLanguageCoche2 = bVar.getUiLanguageCoche();
            e0.checkNotNull(uiLanguageCoche2);
            uiLanguageCoche2.setVisibility(4);
        }
        e0.checkNotNull(viewInflate);
        return viewInflate;
    }
}
