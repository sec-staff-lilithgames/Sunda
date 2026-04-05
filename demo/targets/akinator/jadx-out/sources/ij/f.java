package ij;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import hj.s;
import java.util.Map;
import rj.n;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f extends c {

    /* renamed from: d, reason: collision with root package name */
    public FiamFrameLayout f59644d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f59645e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f59646f;

    /* renamed from: g, reason: collision with root package name */
    public Button f59647g;

    public f(s sVar, LayoutInflater layoutInflater, o oVar) {
        super(sVar, layoutInflater, oVar);
    }

    public View getCollapseButton() {
        return this.f59647g;
    }

    @Override // ij.c
    public View getDialogView() {
        return this.f59645e;
    }

    @Override // ij.c
    public ImageView getImageView() {
        return this.f59646f;
    }

    @Override // ij.c
    public ViewGroup getRootView() {
        return this.f59644d;
    }

    @Override // ij.c
    public ViewTreeObserver.OnGlobalLayoutListener inflate(Map<rj.b, View.OnClickListener> map, View.OnClickListener onClickListener) {
        View viewInflate = this.f59628c.inflate(R.layout.image, (ViewGroup) null);
        this.f59644d = (FiamFrameLayout) viewInflate.findViewById(R.id.image_root);
        this.f59645e = (ViewGroup) viewInflate.findViewById(R.id.image_content_root);
        this.f59646f = (ImageView) viewInflate.findViewById(R.id.image_view);
        this.f59647g = (Button) viewInflate.findViewById(R.id.collapse_button);
        ImageView imageView = this.f59646f;
        s sVar = this.f59627b;
        imageView.setMaxHeight(sVar.getMaxImageHeight());
        this.f59646f.setMaxWidth(sVar.getMaxImageWidth());
        o oVar = this.f59626a;
        if (oVar.getMessageType().equals(MessageType.IMAGE_ONLY)) {
            n nVar = (n) oVar;
            this.f59646f.setVisibility((nVar.getImageData() == null || TextUtils.isEmpty(nVar.getImageData().getImageUrl())) ? 8 : 0);
            this.f59646f.setOnClickListener(map.get(nVar.getAction()));
        }
        this.f59644d.setDismissListener(onClickListener);
        this.f59647g.setOnClickListener(onClickListener);
        return null;
    }
}
