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
public class RObject {
    
    //View getView(Code group, boolean lock);
    
////	object.h
////
////	Author: Eric Nivel
////
////	BSD license:
////	Copyright (c) 2010, Eric Nivel
////	All rights reserved.
////	Redistribution and use in source and binary forms, with or without
////	modification, are permitted provided that the following conditions are met:
////
////   - Redistributions of source code must retain the above copyright
////     notice, this list of conditions and the following disclaimer.
////   - Redistributions in binary form must reproduce the above copyright
////     notice, this list of conditions and the following disclaimer in the
////     documentation and/or other materials provided with the distribution.
////   - Neither the name of Eric Nivel nor the
////     names of their contributors may be used to endorse or promote products
////     derived from this software without specific prior written permission.
////
////	THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND ANY
////	EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
////	WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
////	DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
////	DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
////	(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
////	LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
////	ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
////	(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
////	SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
//#ifndef r_exec_object_h
//#define r_exec_object_h
//
//#include "object.h"
//#include "view.h"
//#include "opcodes.h"
//
//#include <list>
//
//
//namespace r_exec {
//
//dll_export bool IsNotification(Code *object);
//
//// Shared resources:
//// views: accessed by Mem::injectNow (via various sub calls) and Mem::update.
//// psln_thr: accessed by reduction cores (via overlay mod/set).
//// marker_set: accessed by Mem::injectNow ans Mem::_initiate_sln_propagation.
//template<class C, class U> class Object:
//    public C {
//private:
//    size_t hash_value;
//
//    volatile uint64_t invalidated; // must be aligned on 64 bits.
//
//    std::mutex m_pslnThrMutex;
//    std::mutex m_viewsMutex;
//    std::mutex m_markersMutex;
//protected:
//    Object();
//    Object(r_code::Mem *mem);
//public:
//    virtual ~Object(); // un-registers from the rMem's object_register.
//
//    r_code::View *build_view(SysView *source) {
//
//        return Code::build_view<r_exec::View>(source);
//    }
//
//    virtual bool is_invalidated();
//    virtual bool invalidate(); // return false when was not invalidated, true otherwise.
//
//    void compute_hash_value();
//
//    double get_psln_thr();
//
//    void acq_views() {
//        m_viewsMutex.lock();
//    }
//    void rel_views() {
//        m_viewsMutex.unlock();
//    }
//    void acq_markers() {
//        m_markersMutex.lock();
//    }
//    void rel_markers() {
//        m_markersMutex.unlock();
//    }
//
//// Target psln_thr only.
//    void set(uint16_t member_index, double value);
//    void mod(uint16_t member_index, double value);
//
//    View *get_view(Code *group, bool lock); // returns the found view if any, NULL otherwise.
    
//
//    void kill();
//
//    class Hash {
//    public:
//        size_t operator()(U *o) const {
//
//            if (o->hash_value == 0)
//                o->compute_hash_value();
//            return o->hash_value;
//        }
//    };
//
//    class Equal {
//    public:
//        bool operator()(const U *lhs, const U *rhs) const { // lhs and rhs have the same hash value, i.e. same opcode, same code size and same reference size.
//
//            if (lhs->code(0).asOpcode() == Opcodes::Ent || rhs->code(0).asOpcode() == Opcodes::Ent)
//                return lhs == rhs;
//
//            uint16_t i;
//            for (i = 0; i < lhs->references_size(); ++i)
//                if (lhs->get_reference(i) != rhs->get_reference(i))
//                    return false;
//            for (i = 0; i < lhs->code_size(); ++i) {
//
//                if (lhs->code(i) != rhs->code(i))
//                    return false;
//            }
//            return true;
//        }
//    };
//};
//
//// Local object.
//// Used for r-code that does not travel across networks (groups and notifications) or when the rMem is not distributed.
//// Markers are killed when at least one of their references dies (held by their views).
//// Marker deletion is performed by registering pending delete operations in the groups they are projected onto.
//class dll_export LObject:
//    public Object<r_code::LObject, LObject> {
//public:
//    static bool RequiresPacking() {
//        return false;
//    }
//    static LObject *Pack(Code *object, r_code::Mem *mem) {
//        return (LObject *)object; //   object is always a LObject (local operation).
//    }
//    LObject(r_code::Mem *mem = NULL): Object<r_code::LObject, LObject>(mem) {}
//    LObject(r_code::SysObject *source): Object<r_code::LObject, LObject>() {
//
//        load(source);
//    }
//    virtual ~LObject() {}
//};
//}
//
//
//#endif
    
}
