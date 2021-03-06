package myutils15.vm;

import java.util.List;

public class Tpl implements VMCommand {

    @Override
    public void run(VM vm, List<String> params) {
	char register = params.get(0).charAt(0);
	vm.setRegister(register, vm.getRegister(register) * 3);
	vm.setInstructionPointer(vm.getInstructionPointer() + 1);
    }

}
