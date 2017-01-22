package IO_Learn;

import java.io.*;

public class Learn {
    public static void main(String[] args) throws FileNotFoundException {

        // The Bytes Stream - Input
        /*FilterInputStream fis = new FilterInputStream(new FileInputStream(new File("", "")));
        PipedInputStream pis = new PipedInputStream();
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[128]);
        FileInputStream fileis = new FileInputStream(new File());
        RandomAccessFile raf = new RandomAccessFile();
        DataInputStream dis = new DataInputStream();
        BufferedInputStream bis = new BufferedInputStream();
        PushbackInputStream pushbackis = new PushbackInputStream();
        SequenceInputStream sis = new SequenceInputStream();


        // The Chars Stream - Output
        OutputStreamWriter ous = new OutputStreamWriter();
        StringWriter sw = new StringWriter();
        CharArrayWriter caw = new CharArrayWriter();
        PipedWriter pipedw = new PipedWriter();
        PrintWriter pw = new PrintWriter();
        FileWriter fw = new FileWriter();
        BufferedWriter bw = new BufferedWriter();*/

    }

    class MyInputStream extends InputStream {

        /**
         * Reads the next byte of data from the input stream. The value byte is
         * returned as an <code>int</code> in the range <code>0</code> to
         * <code>255</code>. If no byte is available because the end of the stream
         * has been reached, the value <code>-1</code> is returned. This method
         * blocks until input data is available, the end of the stream is detected,
         * or an exception is thrown.
         * <p>
         * <p> A subclass must provide an implementation of this method.
         *
         * @return the next byte of data, or <code>-1</code> if the end of the
         * stream is reached.
         * @throws IOException if an I/O error occurs.
         */
        @Override
        public int read() throws IOException {
            return 0;
        }
    }

    class MyDataInput implements DataInput {

        /**
         * Reads some bytes from an input
         * stream and stores them into the buffer
         * array {@code b}. The number of bytes
         * read is equal
         * to the length of {@code b}.
         * <p>
         * This method blocks until one of the
         * following conditions occurs:
         * <ul>
         * <li>{@code b.length}
         * bytes of input data are available, in which
         * case a normal return is made.
         * <p>
         * <li>End of
         * file is detected, in which case an {@code EOFException}
         * is thrown.
         * <p>
         * <li>An I/O error occurs, in
         * which case an {@code IOException} other
         * than {@code EOFException} is thrown.
         * </ul>
         * <p>
         * If {@code b} is {@code null},
         * a {@code NullPointerException} is thrown.
         * If {@code b.length} is zero, then
         * no bytes are read. Otherwise, the first
         * byte read is stored into element {@code b[0]},
         * the next one into {@code b[1]}, and
         * so on.
         * If an exception is thrown from
         * this method, then it may be that some but
         * not all bytes of {@code b} have been
         * updated with data from the input stream.
         *
         * @param b the buffer into which the data is read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public void readFully(byte[] b) throws IOException {

        }

        /**
         * Reads {@code len}
         * bytes from
         * an input stream.
         * <p>
         * This method
         * blocks until one of the following conditions
         * occurs:
         * <ul>
         * <li>{@code len} bytes
         * of input data are available, in which case
         * a normal return is made.
         * <p>
         * <li>End of file
         * is detected, in which case an {@code EOFException}
         * is thrown.
         * <p>
         * <li>An I/O error occurs, in
         * which case an {@code IOException} other
         * than {@code EOFException} is thrown.
         * </ul>
         * <p>
         * If {@code b} is {@code null},
         * a {@code NullPointerException} is thrown.
         * If {@code off} is negative, or {@code len}
         * is negative, or {@code off+len} is
         * greater than the length of the array {@code b},
         * then an {@code IndexOutOfBoundsException}
         * is thrown.
         * If {@code len} is zero,
         * then no bytes are read. Otherwise, the first
         * byte read is stored into element {@code b[off]},
         * the next one into {@code b[off+1]},
         * and so on. The number of bytes read is,
         * at most, equal to {@code len}.
         *
         * @param b   the buffer into which the data is read.
         * @param off an int specifying the offset into the data.
         * @param len an int specifying the number of bytes to read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public void readFully(byte[] b, int off, int len) throws IOException {

        }

        /**
         * Makes an attempt to skip over
         * {@code n} bytes
         * of data from the input
         * stream, discarding the skipped bytes. However,
         * it may skip
         * over some smaller number of
         * bytes, possibly zero. This may result from
         * any of a
         * number of conditions; reaching
         * end of file before {@code n} bytes
         * have been skipped is
         * only one possibility.
         * This method never throws an {@code EOFException}.
         * The actual
         * number of bytes skipped is returned.
         *
         * @param n the number of bytes to be skipped.
         * @return the number of bytes actually skipped.
         * @throws IOException if an I/O error occurs.
         */
        @Override
        public int skipBytes(int n) throws IOException {
            return 0;
        }

        /**
         * Reads one input byte and returns
         * {@code true} if that byte is nonzero,
         * {@code false} if that byte is zero.
         * This method is suitable for reading
         * the byte written by the {@code writeBoolean}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code boolean} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public boolean readBoolean() throws IOException {
            return false;
        }

        /**
         * Reads and returns one input byte.
         * The byte is treated as a signed value in
         * the range {@code -128} through {@code 127},
         * inclusive.
         * This method is suitable for
         * reading the byte written by the {@code writeByte}
         * method of interface {@code DataOutput}.
         *
         * @return the 8-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public byte readByte() throws IOException {
            return 0;
        }

        /**
         * Reads one input byte, zero-extends
         * it to type {@code int}, and returns
         * the result, which is therefore in the range
         * {@code 0}
         * through {@code 255}.
         * This method is suitable for reading
         * the byte written by the {@code writeByte}
         * method of interface {@code DataOutput}
         * if the argument to {@code writeByte}
         * was intended to be a value in the range
         * {@code 0} through {@code 255}.
         *
         * @return the unsigned 8-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public int readUnsignedByte() throws IOException {
            return 0;
        }

        /**
         * Reads two input bytes and returns
         * a {@code short} value. Let {@code a}
         * be the first byte read and {@code b}
         * be the second byte. The value
         * returned
         * is:
         * <pre>{@code (short)((a << 8) | (b & 0xff))
         * }</pre>
         * This method
         * is suitable for reading the bytes written
         * by the {@code writeShort} method of
         * interface {@code DataOutput}.
         *
         * @return the 16-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public short readShort() throws IOException {
            return 0;
        }

        /**
         * Reads two input bytes and returns
         * an {@code int} value in the range {@code 0}
         * through {@code 65535}. Let {@code a}
         * be the first byte read and
         * {@code b}
         * be the second byte. The value returned is:
         * <pre>{@code (((a & 0xff) << 8) | (b & 0xff))
         * }</pre>
         * This method is suitable for reading the bytes
         * written by the {@code writeShort} method
         * of interface {@code DataOutput}  if
         * the argument to {@code writeShort}
         * was intended to be a value in the range
         * {@code 0} through {@code 65535}.
         *
         * @return the unsigned 16-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public int readUnsignedShort() throws IOException {
            return 0;
        }

        /**
         * Reads two input bytes and returns a {@code char} value.
         * Let {@code a}
         * be the first byte read and {@code b}
         * be the second byte. The value
         * returned is:
         * <pre>{@code (char)((a << 8) | (b & 0xff))
         * }</pre>
         * This method
         * is suitable for reading bytes written by
         * the {@code writeChar} method of interface
         * {@code DataOutput}.
         *
         * @return the {@code char} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public char readChar() throws IOException {
            return 0;
        }

        /**
         * Reads four input bytes and returns an
         * {@code int} value. Let {@code a-d}
         * be the first through fourth bytes read. The value returned is:
         * <pre>{@code
         * (((a & 0xff) << 24) | ((b & 0xff) << 16) |
         *  ((c & 0xff) <<  8) | (d & 0xff))
         * }</pre>
         * This method is suitable
         * for reading bytes written by the {@code writeInt}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code int} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public int readInt() throws IOException {
            return 0;
        }

        /**
         * Reads eight input bytes and returns
         * a {@code long} value. Let {@code a-h}
         * be the first through eighth bytes read.
         * The value returned is:
         * <pre>{@code
         * (((long)(a & 0xff) << 56) |
         *  ((long)(b & 0xff) << 48) |
         *  ((long)(c & 0xff) << 40) |
         *  ((long)(d & 0xff) << 32) |
         *  ((long)(e & 0xff) << 24) |
         *  ((long)(f & 0xff) << 16) |
         *  ((long)(g & 0xff) <<  8) |
         *  ((long)(h & 0xff)))
         * }</pre>
         * <p>
         * This method is suitable
         * for reading bytes written by the {@code writeLong}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code long} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public long readLong() throws IOException {
            return 0;
        }

        /**
         * Reads four input bytes and returns
         * a {@code float} value. It does this
         * by first constructing an {@code int}
         * value in exactly the manner
         * of the {@code readInt}
         * method, then converting this {@code int}
         * value to a {@code float} in
         * exactly the manner of the method {@code Float.intBitsToFloat}.
         * This method is suitable for reading
         * bytes written by the {@code writeFloat}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code float} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public float readFloat() throws IOException {
            return 0;
        }

        /**
         * Reads eight input bytes and returns
         * a {@code double} value. It does this
         * by first constructing a {@code long}
         * value in exactly the manner
         * of the {@code readLong}
         * method, then converting this {@code long}
         * value to a {@code double} in exactly
         * the manner of the method {@code Double.longBitsToDouble}.
         * This method is suitable for reading
         * bytes written by the {@code writeDouble}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code double} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public double readDouble() throws IOException {
            return 0;
        }

        /**
         * Reads the next line of text from the input stream.
         * It reads successive bytes, converting
         * each byte separately into a character,
         * until it encounters a line terminator or
         * end of
         * file; the characters read are then
         * returned as a {@code String}. Note
         * that because this
         * method processes bytes,
         * it does not support input of the full Unicode
         * character set.
         * <p>
         * If end of file is encountered
         * before even one byte can be read, then {@code null}
         * is returned. Otherwise, each byte that is
         * read is converted to type {@code char}
         * by zero-extension. If the character {@code '\n'}
         * is encountered, it is discarded and reading
         * ceases. If the character {@code '\r'}
         * is encountered, it is discarded and, if
         * the following byte converts &#32;to the
         * character {@code '\n'}, then that is
         * discarded also; reading then ceases. If
         * end of file is encountered before either
         * of the characters {@code '\n'} and
         * {@code '\r'} is encountered, reading
         * ceases. Once reading has ceased, a {@code String}
         * is returned that contains all the characters
         * read and not discarded, taken in order.
         * Note that every character in this string
         * will have a value less than {@code \u005Cu0100},
         * that is, {@code (char)256}.
         *
         * @return the next line of text from the input stream,
         * or {@code null} if the end of file is
         * encountered before a byte can be read.
         * @throws IOException if an I/O error occurs.
         */
        @Override
        public String readLine() throws IOException {
            return null;
        }

        /**
         * Reads in a string that has been encoded using a
         * <a href="#modified-utf-8">modified UTF-8</a>
         * format.
         * The general contract of {@code readUTF}
         * is that it reads a representation of a Unicode
         * character string encoded in modified
         * UTF-8 format; this string of characters
         * is then returned as a {@code String}.
         * <p>
         * First, two bytes are read and used to
         * construct an unsigned 16-bit integer in
         * exactly the manner of the {@code readUnsignedShort}
         * method . This integer value is called the
         * <i>UTF length</i> and specifies the number
         * of additional bytes to be read. These bytes
         * are then converted to characters by considering
         * them in groups. The length of each group
         * is computed from the value of the first
         * byte of the group. The byte following a
         * group, if any, is the first byte of the
         * next group.
         * <p>
         * If the first byte of a group
         * matches the bit pattern {@code 0xxxxxxx}
         * (where {@code x} means "may be {@code 0}
         * or {@code 1}"), then the group consists
         * of just that byte. The byte is zero-extended
         * to form a character.
         * <p>
         * If the first byte
         * of a group matches the bit pattern {@code 110xxxxx},
         * then the group consists of that byte {@code a}
         * and a second byte {@code b}. If there
         * is no byte {@code b} (because byte
         * {@code a} was the last of the bytes
         * to be read), or if byte {@code b} does
         * not match the bit pattern {@code 10xxxxxx},
         * then a {@code UTFDataFormatException}
         * is thrown. Otherwise, the group is converted
         * to the character:
         * <pre>{@code (char)(((a & 0x1F) << 6) | (b & 0x3F))
         * }</pre>
         * If the first byte of a group
         * matches the bit pattern {@code 1110xxxx},
         * then the group consists of that byte {@code a}
         * and two more bytes {@code b} and {@code c}.
         * If there is no byte {@code c} (because
         * byte {@code a} was one of the last
         * two of the bytes to be read), or either
         * byte {@code b} or byte {@code c}
         * does not match the bit pattern {@code 10xxxxxx},
         * then a {@code UTFDataFormatException}
         * is thrown. Otherwise, the group is converted
         * to the character:
         * <pre>{@code
         * (char)(((a & 0x0F) << 12) | ((b & 0x3F) << 6) | (c & 0x3F))
         * }</pre>
         * If the first byte of a group matches the
         * pattern {@code 1111xxxx} or the pattern
         * {@code 10xxxxxx}, then a {@code UTFDataFormatException}
         * is thrown.
         * <p>
         * If end of file is encountered
         * at any time during this entire process,
         * then an {@code EOFException} is thrown.
         * <p>
         * After every group has been converted to
         * a character by this process, the characters
         * are gathered, in the same order in which
         * their corresponding groups were read from
         * the input stream, to form a {@code String},
         * which is returned.
         * <p>
         * The {@code writeUTF}
         * method of interface {@code DataOutput}
         * may be used to write data that is suitable
         * for reading by this method.
         *
         * @return a Unicode string.
         * @throws EOFException           if this stream reaches the end
         *                                before reading all the bytes.
         * @throws IOException            if an I/O error occurs.
         * @throws UTFDataFormatException if the bytes do not represent a
         *                                valid modified UTF-8 encoding of a string.
         */
        @Override
        public String readUTF() throws IOException {
            return null;
        }
    }

    class MyObjectInput implements ObjectInput {

        /**
         * Read and return an object. The class that implements this interface
         * defines where the object is "read" from.
         *
         * @return the object read from the stream
         * @throws ClassNotFoundException If the class of a serialized
         *                                object cannot be found.
         * @throws IOException            If any of the usual Input/Output
         *                                related exceptions occur.
         */
        @Override
        public Object readObject() throws ClassNotFoundException, IOException {
            return null;
        }

        /**
         * Reads a byte of data. This method will block if no input is
         * available.
         *
         * @return the byte read, or -1 if the end of the
         * stream is reached.
         * @throws IOException If an I/O error has occurred.
         */
        @Override
        public int read() throws IOException {
            return 0;
        }

        /**
         * Reads into an array of bytes.  This method will
         * block until some input is available.
         *
         * @param b the buffer into which the data is read
         * @return the actual number of bytes read, -1 is
         * returned when the end of the stream is reached.
         * @throws IOException If an I/O error has occurred.
         */
        @Override
        public int read(byte[] b) throws IOException {
            return 0;
        }

        /**
         * Reads into an array of bytes.  This method will
         * block until some input is available.
         *
         * @param b   the buffer into which the data is read
         * @param off the start offset of the data
         * @param len the maximum number of bytes read
         * @return the actual number of bytes read, -1 is
         * returned when the end of the stream is reached.
         * @throws IOException If an I/O error has occurred.
         */
        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            return 0;
        }

        /**
         * Skips n bytes of input.
         *
         * @param n the number of bytes to be skipped
         * @return the actual number of bytes skipped.
         * @throws IOException If an I/O error has occurred.
         */
        @Override
        public long skip(long n) throws IOException {
            return 0;
        }

        /**
         * Returns the number of bytes that can be read
         * without blocking.
         *
         * @return the number of available bytes.
         * @throws IOException If an I/O error has occurred.
         */
        @Override
        public int available() throws IOException {
            return 0;
        }

        /**
         * Closes the input stream. Must be called
         * to release any resources associated with
         * the stream.
         *
         * @throws IOException If an I/O error has occurred.
         */
        @Override
        public void close() throws IOException {

        }

        /**
         * Reads some bytes from an input
         * stream and stores them into the buffer
         * array {@code b}. The number of bytes
         * read is equal
         * to the length of {@code b}.
         * <p>
         * This method blocks until one of the
         * following conditions occurs:
         * <ul>
         * <li>{@code b.length}
         * bytes of input data are available, in which
         * case a normal return is made.
         * <p>
         * <li>End of
         * file is detected, in which case an {@code EOFException}
         * is thrown.
         * <p>
         * <li>An I/O error occurs, in
         * which case an {@code IOException} other
         * than {@code EOFException} is thrown.
         * </ul>
         * <p>
         * If {@code b} is {@code null},
         * a {@code NullPointerException} is thrown.
         * If {@code b.length} is zero, then
         * no bytes are read. Otherwise, the first
         * byte read is stored into element {@code b[0]},
         * the next one into {@code b[1]}, and
         * so on.
         * If an exception is thrown from
         * this method, then it may be that some but
         * not all bytes of {@code b} have been
         * updated with data from the input stream.
         *
         * @param b the buffer into which the data is read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public void readFully(byte[] b) throws IOException {

        }

        /**
         * Reads {@code len}
         * bytes from
         * an input stream.
         * <p>
         * This method
         * blocks until one of the following conditions
         * occurs:
         * <ul>
         * <li>{@code len} bytes
         * of input data are available, in which case
         * a normal return is made.
         * <p>
         * <li>End of file
         * is detected, in which case an {@code EOFException}
         * is thrown.
         * <p>
         * <li>An I/O error occurs, in
         * which case an {@code IOException} other
         * than {@code EOFException} is thrown.
         * </ul>
         * <p>
         * If {@code b} is {@code null},
         * a {@code NullPointerException} is thrown.
         * If {@code off} is negative, or {@code len}
         * is negative, or {@code off+len} is
         * greater than the length of the array {@code b},
         * then an {@code IndexOutOfBoundsException}
         * is thrown.
         * If {@code len} is zero,
         * then no bytes are read. Otherwise, the first
         * byte read is stored into element {@code b[off]},
         * the next one into {@code b[off+1]},
         * and so on. The number of bytes read is,
         * at most, equal to {@code len}.
         *
         * @param b   the buffer into which the data is read.
         * @param off an int specifying the offset into the data.
         * @param len an int specifying the number of bytes to read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public void readFully(byte[] b, int off, int len) throws IOException {

        }

        /**
         * Makes an attempt to skip over
         * {@code n} bytes
         * of data from the input
         * stream, discarding the skipped bytes. However,
         * it may skip
         * over some smaller number of
         * bytes, possibly zero. This may result from
         * any of a
         * number of conditions; reaching
         * end of file before {@code n} bytes
         * have been skipped is
         * only one possibility.
         * This method never throws an {@code EOFException}.
         * The actual
         * number of bytes skipped is returned.
         *
         * @param n the number of bytes to be skipped.
         * @return the number of bytes actually skipped.
         * @throws IOException if an I/O error occurs.
         */
        @Override
        public int skipBytes(int n) throws IOException {
            return 0;
        }

        /**
         * Reads one input byte and returns
         * {@code true} if that byte is nonzero,
         * {@code false} if that byte is zero.
         * This method is suitable for reading
         * the byte written by the {@code writeBoolean}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code boolean} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public boolean readBoolean() throws IOException {
            return false;
        }

        /**
         * Reads and returns one input byte.
         * The byte is treated as a signed value in
         * the range {@code -128} through {@code 127},
         * inclusive.
         * This method is suitable for
         * reading the byte written by the {@code writeByte}
         * method of interface {@code DataOutput}.
         *
         * @return the 8-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public byte readByte() throws IOException {
            return 0;
        }

        /**
         * Reads one input byte, zero-extends
         * it to type {@code int}, and returns
         * the result, which is therefore in the range
         * {@code 0}
         * through {@code 255}.
         * This method is suitable for reading
         * the byte written by the {@code writeByte}
         * method of interface {@code DataOutput}
         * if the argument to {@code writeByte}
         * was intended to be a value in the range
         * {@code 0} through {@code 255}.
         *
         * @return the unsigned 8-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public int readUnsignedByte() throws IOException {
            return 0;
        }

        /**
         * Reads two input bytes and returns
         * a {@code short} value. Let {@code a}
         * be the first byte read and {@code b}
         * be the second byte. The value
         * returned
         * is:
         * <pre>{@code (short)((a << 8) | (b & 0xff))
         * }</pre>
         * This method
         * is suitable for reading the bytes written
         * by the {@code writeShort} method of
         * interface {@code DataOutput}.
         *
         * @return the 16-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public short readShort() throws IOException {
            return 0;
        }

        /**
         * Reads two input bytes and returns
         * an {@code int} value in the range {@code 0}
         * through {@code 65535}. Let {@code a}
         * be the first byte read and
         * {@code b}
         * be the second byte. The value returned is:
         * <pre>{@code (((a & 0xff) << 8) | (b & 0xff))
         * }</pre>
         * This method is suitable for reading the bytes
         * written by the {@code writeShort} method
         * of interface {@code DataOutput}  if
         * the argument to {@code writeShort}
         * was intended to be a value in the range
         * {@code 0} through {@code 65535}.
         *
         * @return the unsigned 16-bit value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public int readUnsignedShort() throws IOException {
            return 0;
        }

        /**
         * Reads two input bytes and returns a {@code char} value.
         * Let {@code a}
         * be the first byte read and {@code b}
         * be the second byte. The value
         * returned is:
         * <pre>{@code (char)((a << 8) | (b & 0xff))
         * }</pre>
         * This method
         * is suitable for reading bytes written by
         * the {@code writeChar} method of interface
         * {@code DataOutput}.
         *
         * @return the {@code char} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public char readChar() throws IOException {
            return 0;
        }

        /**
         * Reads four input bytes and returns an
         * {@code int} value. Let {@code a-d}
         * be the first through fourth bytes read. The value returned is:
         * <pre>{@code
         * (((a & 0xff) << 24) | ((b & 0xff) << 16) |
         *  ((c & 0xff) <<  8) | (d & 0xff))
         * }</pre>
         * This method is suitable
         * for reading bytes written by the {@code writeInt}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code int} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public int readInt() throws IOException {
            return 0;
        }

        /**
         * Reads eight input bytes and returns
         * a {@code long} value. Let {@code a-h}
         * be the first through eighth bytes read.
         * The value returned is:
         * <pre>{@code
         * (((long)(a & 0xff) << 56) |
         *  ((long)(b & 0xff) << 48) |
         *  ((long)(c & 0xff) << 40) |
         *  ((long)(d & 0xff) << 32) |
         *  ((long)(e & 0xff) << 24) |
         *  ((long)(f & 0xff) << 16) |
         *  ((long)(g & 0xff) <<  8) |
         *  ((long)(h & 0xff)))
         * }</pre>
         * <p>
         * This method is suitable
         * for reading bytes written by the {@code writeLong}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code long} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public long readLong() throws IOException {
            return 0;
        }

        /**
         * Reads four input bytes and returns
         * a {@code float} value. It does this
         * by first constructing an {@code int}
         * value in exactly the manner
         * of the {@code readInt}
         * method, then converting this {@code int}
         * value to a {@code float} in
         * exactly the manner of the method {@code Float.intBitsToFloat}.
         * This method is suitable for reading
         * bytes written by the {@code writeFloat}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code float} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public float readFloat() throws IOException {
            return 0;
        }

        /**
         * Reads eight input bytes and returns
         * a {@code double} value. It does this
         * by first constructing a {@code long}
         * value in exactly the manner
         * of the {@code readLong}
         * method, then converting this {@code long}
         * value to a {@code double} in exactly
         * the manner of the method {@code Double.longBitsToDouble}.
         * This method is suitable for reading
         * bytes written by the {@code writeDouble}
         * method of interface {@code DataOutput}.
         *
         * @return the {@code double} value read.
         * @throws EOFException if this stream reaches the end before reading
         *                      all the bytes.
         * @throws IOException  if an I/O error occurs.
         */
        @Override
        public double readDouble() throws IOException {
            return 0;
        }

        /**
         * Reads the next line of text from the input stream.
         * It reads successive bytes, converting
         * each byte separately into a character,
         * until it encounters a line terminator or
         * end of
         * file; the characters read are then
         * returned as a {@code String}. Note
         * that because this
         * method processes bytes,
         * it does not support input of the full Unicode
         * character set.
         * <p>
         * If end of file is encountered
         * before even one byte can be read, then {@code null}
         * is returned. Otherwise, each byte that is
         * read is converted to type {@code char}
         * by zero-extension. If the character {@code '\n'}
         * is encountered, it is discarded and reading
         * ceases. If the character {@code '\r'}
         * is encountered, it is discarded and, if
         * the following byte converts &#32;to the
         * character {@code '\n'}, then that is
         * discarded also; reading then ceases. If
         * end of file is encountered before either
         * of the characters {@code '\n'} and
         * {@code '\r'} is encountered, reading
         * ceases. Once reading has ceased, a {@code String}
         * is returned that contains all the characters
         * read and not discarded, taken in order.
         * Note that every character in this string
         * will have a value less than {@code \u005Cu0100},
         * that is, {@code (char)256}.
         *
         * @return the next line of text from the input stream,
         * or {@code null} if the end of file is
         * encountered before a byte can be read.
         * @throws IOException if an I/O error occurs.
         */
        @Override
        public String readLine() throws IOException {
            return null;
        }

        /**
         * Reads in a string that has been encoded using a
         * <a href="#modified-utf-8">modified UTF-8</a>
         * format.
         * The general contract of {@code readUTF}
         * is that it reads a representation of a Unicode
         * character string encoded in modified
         * UTF-8 format; this string of characters
         * is then returned as a {@code String}.
         * <p>
         * First, two bytes are read and used to
         * construct an unsigned 16-bit integer in
         * exactly the manner of the {@code readUnsignedShort}
         * method . This integer value is called the
         * <i>UTF length</i> and specifies the number
         * of additional bytes to be read. These bytes
         * are then converted to characters by considering
         * them in groups. The length of each group
         * is computed from the value of the first
         * byte of the group. The byte following a
         * group, if any, is the first byte of the
         * next group.
         * <p>
         * If the first byte of a group
         * matches the bit pattern {@code 0xxxxxxx}
         * (where {@code x} means "may be {@code 0}
         * or {@code 1}"), then the group consists
         * of just that byte. The byte is zero-extended
         * to form a character.
         * <p>
         * If the first byte
         * of a group matches the bit pattern {@code 110xxxxx},
         * then the group consists of that byte {@code a}
         * and a second byte {@code b}. If there
         * is no byte {@code b} (because byte
         * {@code a} was the last of the bytes
         * to be read), or if byte {@code b} does
         * not match the bit pattern {@code 10xxxxxx},
         * then a {@code UTFDataFormatException}
         * is thrown. Otherwise, the group is converted
         * to the character:
         * <pre>{@code (char)(((a & 0x1F) << 6) | (b & 0x3F))
         * }</pre>
         * If the first byte of a group
         * matches the bit pattern {@code 1110xxxx},
         * then the group consists of that byte {@code a}
         * and two more bytes {@code b} and {@code c}.
         * If there is no byte {@code c} (because
         * byte {@code a} was one of the last
         * two of the bytes to be read), or either
         * byte {@code b} or byte {@code c}
         * does not match the bit pattern {@code 10xxxxxx},
         * then a {@code UTFDataFormatException}
         * is thrown. Otherwise, the group is converted
         * to the character:
         * <pre>{@code
         * (char)(((a & 0x0F) << 12) | ((b & 0x3F) << 6) | (c & 0x3F))
         * }</pre>
         * If the first byte of a group matches the
         * pattern {@code 1111xxxx} or the pattern
         * {@code 10xxxxxx}, then a {@code UTFDataFormatException}
         * is thrown.
         * <p>
         * If end of file is encountered
         * at any time during this entire process,
         * then an {@code EOFException} is thrown.
         * <p>
         * After every group has been converted to
         * a character by this process, the characters
         * are gathered, in the same order in which
         * their corresponding groups were read from
         * the input stream, to form a {@code String},
         * which is returned.
         * <p>
         * The {@code writeUTF}
         * method of interface {@code DataOutput}
         * may be used to write data that is suitable
         * for reading by this method.
         *
         * @return a Unicode string.
         * @throws EOFException           if this stream reaches the end
         *                                before reading all the bytes.
         * @throws IOException            if an I/O error occurs.
         * @throws UTFDataFormatException if the bytes do not represent a
         *                                valid modified UTF-8 encoding of a string.
         */
        @Override
        public String readUTF() throws IOException {
            return null;
        }
    }
}
