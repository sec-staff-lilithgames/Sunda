package wk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.type.Expr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l extends GeneratedMessageLite.Builder implements m {
    public l clearDescription() {
        copyOnWrite();
        ((Expr) this.instance).clearDescription();
        return this;
    }

    public l clearExpression() {
        copyOnWrite();
        ((Expr) this.instance).clearExpression();
        return this;
    }

    public l clearLocation() {
        copyOnWrite();
        ((Expr) this.instance).clearLocation();
        return this;
    }

    public l clearTitle() {
        copyOnWrite();
        ((Expr) this.instance).clearTitle();
        return this;
    }

    @Override // wk.m
    public String getDescription() {
        return ((Expr) this.instance).getDescription();
    }

    @Override // wk.m
    public ByteString getDescriptionBytes() {
        return ((Expr) this.instance).getDescriptionBytes();
    }

    @Override // wk.m
    public String getExpression() {
        return ((Expr) this.instance).getExpression();
    }

    @Override // wk.m
    public ByteString getExpressionBytes() {
        return ((Expr) this.instance).getExpressionBytes();
    }

    @Override // wk.m
    public String getLocation() {
        return ((Expr) this.instance).getLocation();
    }

    @Override // wk.m
    public ByteString getLocationBytes() {
        return ((Expr) this.instance).getLocationBytes();
    }

    @Override // wk.m
    public String getTitle() {
        return ((Expr) this.instance).getTitle();
    }

    @Override // wk.m
    public ByteString getTitleBytes() {
        return ((Expr) this.instance).getTitleBytes();
    }

    public l setDescription(String str) {
        copyOnWrite();
        ((Expr) this.instance).setDescription(str);
        return this;
    }

    public l setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Expr) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public l setExpression(String str) {
        copyOnWrite();
        ((Expr) this.instance).setExpression(str);
        return this;
    }

    public l setExpressionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Expr) this.instance).setExpressionBytes(byteString);
        return this;
    }

    public l setLocation(String str) {
        copyOnWrite();
        ((Expr) this.instance).setLocation(str);
        return this;
    }

    public l setLocationBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Expr) this.instance).setLocationBytes(byteString);
        return this;
    }

    public l setTitle(String str) {
        copyOnWrite();
        ((Expr) this.instance).setTitle(str);
        return this;
    }

    public l setTitleBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Expr) this.instance).setTitleBytes(byteString);
        return this;
    }
}
