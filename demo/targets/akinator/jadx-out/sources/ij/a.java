package ij;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import hj.s;
import java.util.Map;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a extends c {

    /* renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f59617d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f59618e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f59619f;

    /* renamed from: g, reason: collision with root package name */
    public ResizableImageView f59620g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f59621h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f59622i;

    public a(s sVar, LayoutInflater layoutInflater, o oVar) {
        super(sVar, layoutInflater, oVar);
    }

    @Override // ij.c
    public boolean canSwipeToDismiss() {
        return true;
    }

    @Override // ij.c
    public s getConfig() {
        return this.f59627b;
    }

    @Override // ij.c
    public View getDialogView() {
        return this.f59618e;
    }

    @Override // ij.c
    public View.OnClickListener getDismissListener() {
        return this.f59622i;
    }

    @Override // ij.c
    public ImageView getImageView() {
        return this.f59620g;
    }

    @Override // ij.c
    public ViewGroup getRootView() {
        return this.f59617d;
    }

    @Override // ij.c
    public ViewTreeObserver.OnGlobalLayoutListener inflate(Map<rj.b, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View viewInflate = this.f59628c.inflate(R.layout.banner, (ViewGroup) null);
        this.f59617d = (FiamFrameLayout) viewInflate.findViewById(R.id.banner_root);
        this.f59618e = (ViewGroup) viewInflate.findViewById(R.id.banner_content_root);
        this.f59619f = (TextView) viewInflate.findViewById(R.id.banner_body);
        this.f59620g = (ResizableImageView) viewInflate.findViewById(R.id.banner_image);
        this.f59621h = (TextView) viewInflate.findViewById(R.id.banner_title);
        o oVar = this.f59626a;
        if (oVar.getMessageType().equals(MessageType.BANNER)) {
            rj.f fVar = (rj.f) oVar;
            if (!TextUtils.isEmpty(fVar.getBackgroundHexColor())) {
                c.a(this.f59618e, fVar.getBackgroundHexColor());
            }
            this.f59620g.setVisibility((fVar.getImageData() == null || TextUtils.isEmpty(fVar.getImageData().getImageUrl())) ? 8 : 0);
            if (fVar.getTitle() != null) {
                if (!TextUtils.isEmpty(fVar.getTitle().getText())) {
                    this.f59621h.setText(fVar.getTitle().getText());
                }
                if (!TextUtils.isEmpty(fVar.getTitle().getHexColor())) {
                    this.f59621h.setTextColor(Color.parseColor(fVar.getTitle().getHexColor()));
                }
            }
            if (fVar.getBody() != null) {
                if (!TextUtils.isEmpty(fVar.getBody().getText())) {
                    this.f59619f.setText(fVar.getBody().getText());
                }
                if (!TextUtils.isEmpty(fVar.getBody().getHexColor())) {
                    this.f59619f.setTextColor(Color.parseColor(fVar.getBody().getHexColor()));
                }
            }
            s sVar = this.f59627b;
            int iMin = Math.min(sVar.maxDialogWidthPx().intValue(), sVar.maxDialogHeightPx().intValue());
            ViewGroup.LayoutParams layoutParams = this.f59617d.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = iMin;
            this.f59617d.setLayoutParams(layoutParams);
            this.f59620g.setMaxHeight(sVar.getMaxImageHeight());
            this.f59620g.setMaxWidth(sVar.getMaxImageWidth());
            this.f59622i = onClickListener;
            this.f59617d.setDismissListener(onClickListener);
            this.f59618e.setOnClickListener(map.get(fVar.getAction()));
        }
        return null;
    }
}
