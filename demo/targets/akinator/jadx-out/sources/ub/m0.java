package ub;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m0 implements q0, Serializable {
    public abstract boolean canHandleBinaryNatively();

    public abstract boolean canParseAsync();

    public abstract boolean canUseSchema(g gVar);

    public abstract o createGenerator(DataOutput dataOutput) throws IOException;

    public abstract o createGenerator(DataOutput dataOutput, i iVar) throws IOException;

    public abstract o createGenerator(File file, i iVar) throws IOException;

    public abstract o createGenerator(OutputStream outputStream) throws IOException;

    public abstract o createGenerator(OutputStream outputStream, i iVar) throws IOException;

    public abstract o createGenerator(Writer writer) throws IOException;

    public abstract u createNonBlockingByteArrayParser() throws IOException;

    public abstract u createNonBlockingByteBufferParser() throws IOException;

    public abstract u createParser(DataInput dataInput) throws IOException;

    public abstract u createParser(File file) throws IOException;

    public abstract u createParser(InputStream inputStream) throws IOException;

    public abstract u createParser(Reader reader) throws IOException;

    public abstract u createParser(String str) throws IOException;

    public abstract u createParser(URL url) throws IOException;

    public abstract u createParser(byte[] bArr) throws IOException;

    public abstract u createParser(byte[] bArr, int i10, int i11) throws IOException;

    public abstract u createParser(char[] cArr) throws IOException;

    public abstract u createParser(char[] cArr, int i10, int i11) throws IOException;

    public abstract int getFactoryFeatures();

    public abstract int getFormatGeneratorFeatures();

    public abstract String getFormatName();

    public abstract int getFormatParserFeatures();

    public abstract Class<? extends f> getFormatReadFeatureType();

    public abstract Class<? extends f> getFormatWriteFeatureType();

    public abstract int getGeneratorFeatures();

    public abstract int getParserFeatures();

    public abstract boolean isEnabled(g0 g0Var);

    public abstract boolean isEnabled(j jVar);

    public abstract boolean isEnabled(k0 k0Var);

    public abstract boolean isEnabled(n nVar);

    public abstract boolean isEnabled(r rVar);

    public abstract boolean requiresPropertyOrdering();

    public abstract f0 streamReadConstraints();

    public abstract j0 streamWriteConstraints();

    @Override // ub.q0
    public abstract /* synthetic */ p0 version();
}
