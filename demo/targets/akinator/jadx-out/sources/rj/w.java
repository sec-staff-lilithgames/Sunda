package rj;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.MessagesProto$Text;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public String f84501a;

    /* renamed from: b, reason: collision with root package name */
    public String f84502b;

    public x build() {
        if (TextUtils.isEmpty(this.f84502b)) {
            throw new IllegalArgumentException("Text model must have a color");
        }
        return new x(this.f84501a, this.f84502b);
    }

    public w setHexColor(String str) {
        this.f84502b = str;
        return this;
    }

    public w setText(String str) {
        this.f84501a = str;
        return this;
    }

    public w setText(MessagesProto$Text messagesProto$Text) {
        setText(messagesProto$Text.getText());
        setHexColor(messagesProto$Text.getHexColor());
        return this;
    }
}
