package ij;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import hj.s;
import java.util.Map;
import rj.k;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d extends c {

    /* renamed from: d, reason: collision with root package name */
    public FiamCardView f59629d;

    /* renamed from: e, reason: collision with root package name */
    public lj.b f59630e;

    /* renamed from: f, reason: collision with root package name */
    public ScrollView f59631f;

    /* renamed from: g, reason: collision with root package name */
    public Button f59632g;

    /* renamed from: h, reason: collision with root package name */
    public Button f59633h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f59634i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f59635j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f59636k;

    /* renamed from: l, reason: collision with root package name */
    public k f59637l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnClickListener f59638m;

    /* renamed from: n, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f59639n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            d.this.f59634i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public d(s sVar, LayoutInflater layoutInflater, o oVar) {
        super(sVar, layoutInflater, oVar);
        this.f59639n = new a();
    }

    @Override // ij.c
    public s getConfig() {
        return this.f59627b;
    }

    @Override // ij.c
    public View getDialogView() {
        return this.f59630e;
    }

    @Override // ij.c
    public View.OnClickListener getDismissListener() {
        return this.f59638m;
    }

    @Override // ij.c
    public ImageView getImageView() {
        return this.f59634i;
    }

    public Button getPrimaryButton() {
        return this.f59632g;
    }

    @Override // ij.c
    public ViewGroup getRootView() {
        return this.f59629d;
    }

    public View getScrollView() {
        return this.f59631f;
    }

    public Button getSecondaryButton() {
        return this.f59633h;
    }

    public View getTitleView() {
        return this.f59636k;
    }

    @Override // ij.c
    public ViewTreeObserver.OnGlobalLayoutListener inflate(Map<rj.b, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View viewInflate = this.f59628c.inflate(R.layout.card, (ViewGroup) null);
        this.f59631f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f59632g = (Button) viewInflate.findViewById(R.id.primary_button);
        this.f59633h = (Button) viewInflate.findViewById(R.id.secondary_button);
        this.f59634i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f59635j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f59636k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f59629d = (FiamCardView) viewInflate.findViewById(R.id.card_root);
        this.f59630e = (lj.b) viewInflate.findViewById(R.id.card_content_root);
        o oVar = this.f59626a;
        if (oVar.getMessageType().equals(MessageType.CARD)) {
            k kVar = (k) oVar;
            this.f59637l = kVar;
            this.f59636k.setText(kVar.getTitle().getText());
            this.f59636k.setTextColor(Color.parseColor(kVar.getTitle().getHexColor()));
            if (kVar.getBody() == null || kVar.getBody().getText() == null) {
                this.f59631f.setVisibility(8);
                this.f59635j.setVisibility(8);
            } else {
                this.f59631f.setVisibility(0);
                this.f59635j.setVisibility(0);
                this.f59635j.setText(kVar.getBody().getText());
                this.f59635j.setTextColor(Color.parseColor(kVar.getBody().getHexColor()));
            }
            k kVar2 = this.f59637l;
            if (kVar2.getPortraitImageData() == null && kVar2.getLandscapeImageData() == null) {
                this.f59634i.setVisibility(8);
            } else {
                this.f59634i.setVisibility(0);
            }
            rj.b primaryAction = this.f59637l.getPrimaryAction();
            rj.b secondaryAction = this.f59637l.getSecondaryAction();
            c.setupViewButtonFromModel(this.f59632g, primaryAction.getButton());
            Button button = this.f59632g;
            View.OnClickListener onClickListener2 = map.get(primaryAction);
            if (button != null) {
                button.setOnClickListener(onClickListener2);
            }
            this.f59632g.setVisibility(0);
            if (secondaryAction == null || secondaryAction.getButton() == null) {
                this.f59633h.setVisibility(8);
            } else {
                c.setupViewButtonFromModel(this.f59633h, secondaryAction.getButton());
                Button button2 = this.f59633h;
                View.OnClickListener onClickListener3 = map.get(secondaryAction);
                if (button2 != null) {
                    button2.setOnClickListener(onClickListener3);
                }
                this.f59633h.setVisibility(0);
            }
            ImageView imageView = this.f59634i;
            s sVar = this.f59627b;
            imageView.setMaxHeight(sVar.getMaxImageHeight());
            this.f59634i.setMaxWidth(sVar.getMaxImageWidth());
            this.f59638m = onClickListener;
            this.f59629d.setDismissListener(onClickListener);
            c.a(this.f59630e, this.f59637l.getBackgroundHexColor());
        }
        return this.f59639n;
    }

    public void setLayoutListener(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f59639n = onGlobalLayoutListener;
    }
}
