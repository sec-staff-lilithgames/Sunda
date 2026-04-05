package rb;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface i extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    String getError();

    ByteString getErrorBytes();

    f getFile(int i10);

    int getFileCount();

    List<f> getFileList();

    g getFileOrBuilder(int i10);

    List<? extends g> getFileOrBuilderList();

    long getSupportedFeatures();

    boolean hasError();

    boolean hasSupportedFeatures();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
