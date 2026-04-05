package ij;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import hj.s;
import java.util.Map;
import rj.o;
import rj.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class h extends c {

    /* renamed from: d, reason: collision with root package name */
    public FiamRelativeLayout f59651d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f59652e;

    /* renamed from: f, reason: collision with root package name */
    public ScrollView f59653f;

    /* renamed from: g, reason: collision with root package name */
    public Button f59654g;

    /* renamed from: h, reason: collision with root package name */
    public View f59655h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f59656i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f59657j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f59658k;

    /* renamed from: l, reason: collision with root package name */
    public q f59659l;

    /* renamed from: m, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f59660m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            h.this.f59656i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public h(s sVar, LayoutInflater layoutInflater, o oVar) {
        super(sVar, layoutInflater, oVar);
        this.f59660m = new a();
    }

    public Button getActionButton() {
        return this.f59654g;
    }

    public View getCollapseButton() {
        return this.f59655h;
    }

    @Override // ij.c
    public s getConfig() {
        return this.f59627b;
    }

    @Override // ij.c
    public View getDialogView() {
        return this.f59652e;
    }

    @Override // ij.c
    public ImageView getImageView() {
        return this.f59656i;
    }

    @Override // ij.c
    public ViewGroup getRootView() {
        return this.f59651d;
    }

    public View getScrollView() {
        return this.f59653f;
    }

    public View getTitleView() {
        return this.f59658k;
    }

    @Override // ij.c
    public ViewTreeObserver.OnGlobalLayoutListener inflate(Map<rj.b, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View viewInflate = this.f59628c.inflate(R.layout.modal, (ViewGroup) null);
        this.f59653f = (ScrollView) viewInflate.findViewById(R.id.body_scroll);
        this.f59654g = (Button) viewInflate.findViewById(R.id.button);
        this.f59655h = viewInflate.findViewById(R.id.collapse_button);
        this.f59656i = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f59657j = (TextView) viewInflate.findViewById(R.id.message_body);
        this.f59658k = (TextView) viewInflate.findViewById(R.id.message_title);
        this.f59651d = (FiamRelativeLayout) viewInflate.findViewById(R.id.modal_root);
        this.f59652e = (ViewGroup) viewInflate.findViewById(R.id.modal_content_root);
        o oVar = this.f59626a;
        if (oVar.getMessageType().equals(MessageType.MODAL)) {
            q qVar = (q) oVar;
            this.f59659l = qVar;
            if (qVar.getImageData() == null || TextUtils.isEmpty(qVar.getImageData().getImageUrl())) {
                this.f59656i.setVisibility(8);
            } else {
                this.f59656i.setVisibility(0);
            }
            if (qVar.getTitle() != null) {
                if (TextUtils.isEmpty(qVar.getTitle().getText())) {
                    this.f59658k.setVisibility(8);
                } else {
                    this.f59658k.setVisibility(0);
                    this.f59658k.setText(qVar.getTitle().getText());
                }
                if (!TextUtils.isEmpty(qVar.getTitle().getHexColor())) {
                    this.f59658k.setTextColor(Color.parseColor(qVar.getTitle().getHexColor()));
                }
            }
            if (qVar.getBody() == null || TextUtils.isEmpty(qVar.getBody().getText())) {
                this.f59653f.setVisibility(8);
                this.f59657j.setVisibility(8);
            } else {
                this.f59653f.setVisibility(0);
                this.f59657j.setVisibility(0);
                this.f59657j.setTextColor(Color.parseColor(qVar.getBody().getHexColor()));
                this.f59657j.setText(qVar.getBody().getText());
            }
            rj.b action = this.f59659l.getAction();
            if (action == null || action.getButton() == null || TextUtils.isEmpty(action.getButton().getText().getText())) {
                this.f59654g.setVisibility(8);
            } else {
                c.setupViewButtonFromModel(this.f59654g, action.getButton());
                Button button = this.f59654g;
                View.OnClickListener onClickListener2 = map.get(this.f59659l.getAction());
                if (button != null) {
                    button.setOnClickListener(onClickListener2);
                }
                this.f59654g.setVisibility(0);
            }
            ImageView imageView = this.f59656i;
            s sVar = this.f59627b;
            imageView.setMaxHeight(sVar.getMaxImageHeight());
            this.f59656i.setMaxWidth(sVar.getMaxImageWidth());
            this.f59655h.setOnClickListener(onClickListener);
            this.f59651d.setDismissListener(onClickListener);
            c.a(this.f59652e, this.f59659l.getBackgroundHexColor());
        }
        return this.f59660m;
    }

    public void setLayoutListener(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f59660m = onGlobalLayoutListener;
    }
}
