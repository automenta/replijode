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
public class RClass {
    
}

//class Class {
//private:
//    bool has_offset() const;
//public:
//    static const char *Expression;
//    static const char *Type;
//
//    Class(ReturnType t = ANY);
//    Class(Atom atom,
//          std::string str_opcode,
//          std::vector<StructureMember> r,
//          ReturnType t = ANY);
//    bool is_pattern(Metadata *metadata) const;
//    bool is_fact(Metadata *metadata) const;
//    bool get_member_index(Metadata *metadata, std::string &name, uint16_t &index, Class *&p) const;
//    std::string get_member_name(uint64_t index); // for decompilation
//    ReturnType get_member_type(const uint16_t index);
//    Class *get_member_class(Metadata *metadata, const std::string &name);
//    Atom atom;
//    std::string str_opcode; // unused for anything but objects, markers and operators.
//    std::vector<StructureMember> things_to_read;
//    ReturnType type; // ANY for non-operators.
//    StructureMember::Iteration use_as;
//
//    void write(uintptr_t *storage);
//    void read(uintptr_t *storage);
//    size_t get_size();
//};
//}
