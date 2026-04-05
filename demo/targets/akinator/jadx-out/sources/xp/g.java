package xp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import nm.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g extends SSLSocket {

    /* renamed from: b, reason: collision with root package name */
    public final SSLSocket f92187b;

    public g(SSLSocket sSLSocket) {
        this.f92187b = sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocket
    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f92187b.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void bind(SocketAddress socketAddress) throws IOException {
        this.f92187b.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        j.close(this.f92187b);
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress) throws IOException {
        this.f92187b.connect(socketAddress);
    }

    public boolean equals(Object obj) {
        return this.f92187b.equals(obj);
    }

    @Override // java.net.Socket
    public SocketChannel getChannel() {
        return this.f92187b.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getEnableSessionCreation() {
        return this.f92187b.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledCipherSuites() {
        return this.f92187b.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getEnabledProtocols() {
        return this.f92187b.getEnabledProtocols();
    }

    @Override // java.net.Socket
    public InetAddress getInetAddress() {
        return this.f92187b.getInetAddress();
    }

    @Override // java.net.Socket
    public InputStream getInputStream() throws IOException {
        return this.f92187b.getInputStream();
    }

    @Override // java.net.Socket
    public boolean getKeepAlive() throws SocketException {
        return this.f92187b.getKeepAlive();
    }

    @Override // java.net.Socket
    public InetAddress getLocalAddress() {
        return this.f92187b.getLocalAddress();
    }

    @Override // java.net.Socket
    public int getLocalPort() {
        return this.f92187b.getLocalPort();
    }

    @Override // java.net.Socket
    public SocketAddress getLocalSocketAddress() {
        return this.f92187b.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getNeedClientAuth() {
        return this.f92187b.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public boolean getOOBInline() throws SocketException {
        return this.f92187b.getOOBInline();
    }

    @Override // java.net.Socket
    public OutputStream getOutputStream() throws IOException {
        return this.f92187b.getOutputStream();
    }

    @Override // java.net.Socket
    public int getPort() {
        return this.f92187b.getPort();
    }

    @Override // java.net.Socket
    public synchronized int getReceiveBufferSize() throws SocketException {
        return this.f92187b.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public SocketAddress getRemoteSocketAddress() {
        return this.f92187b.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public boolean getReuseAddress() throws SocketException {
        return this.f92187b.getReuseAddress();
    }

    @Override // java.net.Socket
    public synchronized int getSendBufferSize() throws SocketException {
        return this.f92187b.getSendBufferSize();
    }

    @Override // javax.net.ssl.SSLSocket
    public SSLSession getSession() {
        return this.f92187b.getSession();
    }

    @Override // java.net.Socket
    public int getSoLinger() throws SocketException {
        return this.f92187b.getSoLinger();
    }

    @Override // java.net.Socket
    public synchronized int getSoTimeout() throws SocketException {
        return this.f92187b.getSoTimeout();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedCipherSuites() {
        return this.f92187b.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public String[] getSupportedProtocols() {
        return this.f92187b.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public boolean getTcpNoDelay() throws SocketException {
        return this.f92187b.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public int getTrafficClass() throws SocketException {
        return this.f92187b.getTrafficClass();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getUseClientMode() {
        return this.f92187b.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public boolean getWantClientAuth() {
        return this.f92187b.getWantClientAuth();
    }

    @Override // java.net.Socket
    public boolean isBound() {
        return this.f92187b.isBound();
    }

    @Override // java.net.Socket
    public boolean isClosed() {
        return this.f92187b.isClosed();
    }

    @Override // java.net.Socket
    public boolean isConnected() {
        return this.f92187b.isConnected();
    }

    @Override // java.net.Socket
    public boolean isInputShutdown() {
        return this.f92187b.isInputShutdown();
    }

    @Override // java.net.Socket
    public boolean isOutputShutdown() {
        return this.f92187b.isOutputShutdown();
    }

    @Override // javax.net.ssl.SSLSocket
    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f92187b.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public void sendUrgentData(int i10) throws IOException {
        this.f92187b.sendUrgentData(i10);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnableSessionCreation(boolean z10) {
        this.f92187b.setEnableSessionCreation(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledCipherSuites(String[] strArr) {
        this.f92187b.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setEnabledProtocols(String[] strArr) {
        this.f92187b.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public void setKeepAlive(boolean z10) throws SocketException {
        this.f92187b.setKeepAlive(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setNeedClientAuth(boolean z10) {
        this.f92187b.setNeedClientAuth(z10);
    }

    @Override // java.net.Socket
    public void setOOBInline(boolean z10) throws SocketException {
        this.f92187b.setOOBInline(z10);
    }

    @Override // java.net.Socket
    public void setPerformancePreferences(int i10, int i11, int i12) {
        this.f92187b.setPerformancePreferences(i10, i11, i12);
    }

    @Override // java.net.Socket
    public synchronized void setReceiveBufferSize(int i10) throws SocketException {
        this.f92187b.setReceiveBufferSize(i10);
    }

    @Override // java.net.Socket
    public void setReuseAddress(boolean z10) throws SocketException {
        this.f92187b.setReuseAddress(z10);
    }

    @Override // java.net.Socket
    public synchronized void setSendBufferSize(int i10) throws SocketException {
        this.f92187b.setSendBufferSize(i10);
    }

    @Override // java.net.Socket
    public void setSoLinger(boolean z10, int i10) throws SocketException {
        this.f92187b.setSoLinger(z10, i10);
    }

    @Override // java.net.Socket
    public synchronized void setSoTimeout(int i10) throws SocketException {
        this.f92187b.setSoTimeout(i10);
    }

    @Override // java.net.Socket
    public void setTcpNoDelay(boolean z10) throws SocketException {
        this.f92187b.setTcpNoDelay(z10);
    }

    @Override // java.net.Socket
    public void setTrafficClass(int i10) throws SocketException {
        this.f92187b.setTrafficClass(i10);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setUseClientMode(boolean z10) {
        this.f92187b.setUseClientMode(z10);
    }

    @Override // javax.net.ssl.SSLSocket
    public void setWantClientAuth(boolean z10) {
        this.f92187b.setWantClientAuth(z10);
    }

    @Override // java.net.Socket
    public void shutdownInput() throws IOException {
        this.f92187b.shutdownInput();
    }

    @Override // java.net.Socket
    public void shutdownOutput() throws IOException {
        this.f92187b.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public void startHandshake() throws IOException {
        this.f92187b.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public String toString() {
        return this.f92187b.toString();
    }

    @Override // java.net.Socket
    public void connect(SocketAddress socketAddress, int i10) throws IOException {
        this.f92187b.connect(socketAddress, i10);
    }
}
