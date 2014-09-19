/*
 * Copyright (C) 2014 me
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package replijode;

/**
 *
 * @author me
 */
public class Image {
    
}

//template<class I> class Image:
//    public I {
//    friend class r_comp::Image;
//public:
//    static Image<I> *Build(uint64_t timestamp, size_t map_size, size_t code_size, size_t names_size);
//// file IO
//    static Image<I> *Read(ifstream &stream);
//    static void Write(Image<I> *image, ofstream &stream);
//
//    Image();
//    ~Image();
//
//    size_t get_size() const; // size of data in word32
//    size_t getObjectCount() const;
//    uintptr_t *getObject(size_t i); // points to the code size of the object; the first atom is at getObject()+2
//    uintptr_t *getCodeSegment(); // equals getObject(0)
//    size_t getCodeSegmentSize() const;
//
//    void trace() const;
//};
//
//// utilities
//size_t dll_export GetSize(const std::string &s); // returns the number of word32 needed to encode the string
//void dll_export Write(uintptr_t *data, const std::string &s);
//void dll_export Read(uintptr_t *data, std::string &s);
//}
//
